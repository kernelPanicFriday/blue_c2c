package com.kernalPanic.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<NewsArticle> allNews(){
        return newsRepository.findAll();
    }
}
