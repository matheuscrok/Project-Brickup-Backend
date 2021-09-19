package com.crok.projectbrickupbackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Date;

@NoArgsConstructor
@Entity
@Getter
@Setter
public class Image {
    @Id
    private Long id;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String conteudo;

    private Date data;

}
