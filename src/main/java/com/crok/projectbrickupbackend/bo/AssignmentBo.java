package com.crok.projectbrickupbackend.bo;

import com.crok.projectbrickupbackend.dao.AssignmentDao;
import com.crok.projectbrickupbackend.dao.ImageDao;
import com.crok.projectbrickupbackend.dto.AssignmentDto;
import com.crok.projectbrickupbackend.entity.Assignment;
import com.crok.projectbrickupbackend.entity.BackendException;
import com.crok.projectbrickupbackend.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AssignmentBo {
    @Autowired
    private ImageDao imageDao;

    @Autowired
    private AssignmentDao assignmentDao;


    public void salvar(AssignmentDto assignmentDto) {
        Assignment assignment = assignmentDao.save(assignmentDto.getAssignment());


        try {
////		salva no banco
            Image img = new Image();
            img.setId((long) assignment.getId());
            img.setConteudo(assignmentDto.getFoto());
            img.setData(new Date());
            imageDao.save(img);
        }catch(BackendException e){
            e.printStackTrace();
            throw new BackendException(e.getMessage(), e);
        }

    }
}

