package com.crok.projectbrickupbackend.dao;

import com.crok.projectbrickupbackend.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentDao extends JpaRepository<Assignment, Integer> {


}

