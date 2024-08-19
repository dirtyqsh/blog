package com.dirtyqsh.blog.repositories;

import com.dirtyqsh.blog.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Integer> {
}
