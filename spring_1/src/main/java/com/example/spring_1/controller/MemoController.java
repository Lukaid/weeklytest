package com.example.spring_1.controller;

import com.example.spring_1.domain.MemoRepository;
import com.example.spring_1.dto.MemoDto;
import com.example.spring_1.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MemoController {

    MemoRepository memoRepository;

    @PostMapping("/post")
    public void post(@RequestBody MemoDto memoDto) {
        memoRepository.save(memoDto.getMemo());
    }
}