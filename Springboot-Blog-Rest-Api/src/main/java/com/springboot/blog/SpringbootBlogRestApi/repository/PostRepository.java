package com.springboot.blog.SpringbootBlogRestApi.repository;

import com.springboot.blog.SpringbootBlogRestApi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
