package com.sparta.personalStudy.domain;

import com.sparta.personalStudy.dto.PostDto;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;
    private String contents;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();

    public Post(PostDto postDto) {
        this.title = postDto.getTitle();
        this.contents = postDto.getContents();
    }
}
