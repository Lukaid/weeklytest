package com.sparta.weeklytestspring.repository;

import com.sparta.weeklytestspring.domain.Tags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<Tags, Long> {
}
