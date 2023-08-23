package com.kernalPanic.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping
    public ResponseEntity<List<NewsArticle>> getAllNews(){
        return new ResponseEntity<List<NewsArticle>>(newsService.allNews(), HttpStatus.OK);
    }
}
