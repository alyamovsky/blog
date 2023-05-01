package com.alyamovsky.blog.controller;

import com.alyamovsky.blog.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {
    @GetMapping("/api/posts")
    public List<Post> getPosts(@RequestParam(required = false) Integer limit, @RequestParam(required = false) Integer page) {
        return null;
    }
}
