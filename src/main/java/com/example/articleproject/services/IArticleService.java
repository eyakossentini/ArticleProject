package com.example.articleproject.services;

import com.example.articleproject.entities.Article;

import java.util.List;

public interface IArticleService {

    Article addArticle(Article a);
    Article updateArticle(Article a);
    List<Article> getAllArticles();
    Article getArticleById(long id);
    void deleteArticleById(long id);
    void deleteArticle(Article a);
}
