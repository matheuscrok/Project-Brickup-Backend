package com.crok.projectbrickupbackend.dto;

import com.crok.projectbrickupbackend.entity.Assignment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AssignmentDto {
    private Assignment assignment;

    private String foto;

}
