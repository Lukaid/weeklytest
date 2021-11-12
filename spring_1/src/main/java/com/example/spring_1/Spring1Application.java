package com.example.spring_1;

import com.example.spring_1.domain.Memo;
import com.example.spring_1.domain.MemoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Spring1Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring1Application.class, args);

    }

    @Bean
    public CommandLineRunner demo(MemoRepository memoRepository) {
        return (args) -> {
            Memo addMemo = new Memo("qwer");
        };
    }

}
