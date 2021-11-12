package com.example.spring_1.service;

import com.example.spring_1.domain.Memo;
import com.example.spring_1.domain.MemoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MemoService {

    private final MemoRepository memoRepository;

    public MemoService(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }

    @Transactional
    public Long update(Long id, Memo memo) {
        Memo memo1 = memoRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("ㅜㅜ")
        );
        memo1.update(memo);
        return memo.getId();
    }

}