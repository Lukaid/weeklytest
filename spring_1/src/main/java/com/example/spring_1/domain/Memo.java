package com.example.spring_1.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다.
    private Long id;

    @Column(nullable = false)
    private String memo;

    public Memo() {

    }

    public Long getId() {
        return id;
    }

    public String getMemo() {
        return memo;
    }

    public Memo(String memo) {
        this.memo = memo;
    }

    public void update(Memo memo) {
        this.memo = memo.memo;
    }
}
