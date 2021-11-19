package com.example.spring_02.controller;

import com.example.spring_02.domain.Article;
import com.example.spring_02.dto.ArticleRequestDto;
import com.example.spring_02.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping("/article")
    public Article setArticle(@RequestBody ArticleRequestDto articleRequestDto){
        System.out.println(articleRequestDto.getContent());
        return articleService.setArticle(articleRequestDto);
    }

    @GetMapping("/article")
    public List<Article> getAllArticle() {
        return articleService.getAllArticle();
    }

    @GetMapping("/article/{id}")
    public Article getArticle(@PathVariable Long id){
        return articleService.getArticle(id);
    }
}
