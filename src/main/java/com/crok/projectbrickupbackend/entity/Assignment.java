package com.crok.projectbrickupbackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Assignment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Task name is mandatory")
    @NotEmpty(message = "Task name is mandatory")
    @Length(min = 2, max = 200, message = "The task name must be between 2 and 200 characters.")
    private String name;

    private boolean status=false;

    private String pathimage;




}
