package com.springboot.chap6.repository;

import com.springboot.chap6.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
