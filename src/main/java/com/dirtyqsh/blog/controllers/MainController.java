package com.dirtyqsh.blog.controllers;

import com.dirtyqsh.blog.entities.Article;
import com.dirtyqsh.blog.repositories.ArticleRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class MainController {

    @Autowired
    private ArticleRepo articleRepo;

    @PostMapping("/api/article")
    public void addArticle(@RequestBody Article article) {
        log.info("New row: {}", articleRepo.save(article));
    }

    @GetMapping("/api/articles")
    public List<Article> getAllArticles() {
        return articleRepo.findAll();
    }

    @GetMapping("/api/{id}")
    public Article getArticle(@PathVariable("id") int id) {
        return articleRepo.findById(id).orElseThrow();
    }

    @DeleteMapping("/api/article/{id}")
    public void deleteArticle(@PathVariable("id") int id) {
        articleRepo.deleteById(id);
    }

    @PutMapping("/api/article/{id}")
    public String updateArticle(@PathVariable("id") Article article) {
        if (!articleRepo.existsById(article.getId())) {
            return "No such row";
        }
        return articleRepo.save(article).toString() ;
    }
}
