package com.crok.projectbrickupbackend.rest;

import com.crok.projectbrickupbackend.dao.ImageDao;
import com.crok.projectbrickupbackend.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;
import java.util.Optional;

@RestController
@RequestMapping("/image")
public class ImageRest {


    @Autowired
    private ImageDao imageDao;




    @GetMapping("/{id}")
    public void downloadFileDb(@PathVariable("id") Long id, HttpServletResponse response, HttpServletRequest request) throws IOException{
        Optional<Image> imgOpt = imageDao.findById(id);

        if(imgOpt.isPresent()) {
            Image img = imgOpt.get();

            response.setContentType("image/png");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Cache-Control", "no-cache");
            byte [] fileContent = Base64.getDecoder().decode(img.getConteudo());
            response.getOutputStream().write(fileContent);
        }

    }


}
