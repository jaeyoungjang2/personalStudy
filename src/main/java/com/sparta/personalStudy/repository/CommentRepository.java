package com.sparta.personalStudy.repository;

import com.sparta.personalStudy.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
