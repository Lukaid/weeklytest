package com.example.spring_02.service;

import com.example.spring_02.domain.Article;
import com.example.spring_02.dto.ArticleRequestDto;
import com.example.spring_02.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Article setArticle(ArticleRequestDto articleRequestDto){
        Article article = new Article();
        article.setTitle(articleRequestDto.getTitle());
        article.setContent(articleRequestDto.getContent());
        articleRepository.save(article);
        return article;
    }

    public List<Article> getAllArticle() {
        return articleRepository.findAll();
    }

    public Article getArticle(Long id){
        return articleRepository.findById(id).get();
    }
}

