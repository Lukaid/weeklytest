package com.example.spring_02.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ArticleRequestDto {
    private String title;
    private String content;
}
