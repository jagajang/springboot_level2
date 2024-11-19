package com.springboot.chap6.service;

import com.springboot.chap6.domain.Article;
import com.springboot.chap6.dto.AddArticleRequest;
import com.springboot.chap6.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}