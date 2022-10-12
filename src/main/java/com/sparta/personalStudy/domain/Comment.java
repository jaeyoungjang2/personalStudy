package com.sparta.personalStudy.domain;

import com.sparta.personalStudy.dto.CommentDto;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String contents;

    public Comment(CommentDto commentDto) {
        this.contents = commentDto.getContents();
    }
}
