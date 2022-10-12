package com.sparta.personalStudy.controller;

import com.sparta.personalStudy.domain.Post;
import com.sparta.personalStudy.dto.PostDto;
import com.sparta.personalStudy.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;

    @PostMapping("/api/posts")
    public void savePost(@RequestBody PostDto postDto) {
        Post post = new Post(postDto);
        postRepository.save(post);
    }

    @GetMapping("/api/posts/{id}")
    public Post findOnePost(@PathVariable Long id) {
        return postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("문제 발생"));
    }

    @GetMapping("/api/posts")
    public List<Post> findOnePost() {
        return postRepository.findAll();
    }
}
