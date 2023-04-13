package com.springboot.blog.SpringbootBlogRestApi.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"titulo"})})
public class Post {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Titulo", nullable = false)
    private String titulo;
    @Column(name = "Descripcion", nullable = false)
    private String descripcion;
    @Column(name = "Contenido", nullable = false)
    private String contenido;

}
