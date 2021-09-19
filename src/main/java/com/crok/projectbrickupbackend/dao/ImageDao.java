package com.crok.projectbrickupbackend.dao;

import com.crok.projectbrickupbackend.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageDao extends JpaRepository<Image,Long> {
}
