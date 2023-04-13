package com.springboot.blog.SpringbootBlogRestApi.payload;

import lombok.Data;

@Data
public class PostDto {

    private Long id;
    private String titulo;
    private String descripcion;
    private String contenido;
}
