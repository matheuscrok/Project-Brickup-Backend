package com.crok.projectbrickupbackend.rest;

import com.crok.projectbrickupbackend.bo.AssignmentBo;
import com.crok.projectbrickupbackend.dao.AssignmentDao;
import com.crok.projectbrickupbackend.dto.AssignmentDto;
import com.crok.projectbrickupbackend.entity.Assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignment")
public class AssignmentRest {


    @Autowired
    private AssignmentDao assignmentDao;

    @Autowired
    private AssignmentBo assignmentBo;


    @GetMapping
    public List<Assignment> get(){
        return assignmentDao.findAll();
    }

    @PostMapping
    public void post(@RequestBody AssignmentDto assignmentDto) {
        assignmentBo.salvar(assignmentDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        assignmentDao.deleteById(id);
    }


}
