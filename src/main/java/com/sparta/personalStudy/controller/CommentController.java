package com.sparta.personalStudy.controller;

import com.sparta.personalStudy.domain.Comment;
import com.sparta.personalStudy.domain.Post;
import com.sparta.personalStudy.dto.CommentDto;
import com.sparta.personalStudy.dto.PostDto;
import com.sparta.personalStudy.repository.CommentRepository;
import com.sparta.personalStudy.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository commentRepository;

    @PostMapping("/api/posts")
    public void savePost(@RequestBody CommentDto commentDto) {
        Comment comment = new Comment(commentDto);
        commentRepository.save(comment);
    }

    @GetMapping("/api/posts/{id}")
    public Comment findOnePost(@PathVariable Long id) {
        return commentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("문제 발생"));
    }

    @GetMapping("/api/posts")
    public List<Comment> findOnePost() {
        return commentRepository.findAll();
    }
}
