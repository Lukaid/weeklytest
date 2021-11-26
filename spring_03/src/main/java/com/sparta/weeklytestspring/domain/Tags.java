package com.sparta.weeklytestspring.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.weeklytestspring.dto.ArticleRequestDto;
import com.sparta.weeklytestspring.dto.AtricleTagsRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Tags extends Timestamped {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long idx;

    @Column(nullable = false)
    private String tags;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="article_idx", nullable = false)
    private Article article;

    public Tags(AtricleTagsRequestDto aricleTagsRequestDto, Article article) {
        this.tags = aricleTagsRequestDto.getTags();
        this.article = article;
    }
}
