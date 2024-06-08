package com.example.articleproject.services;

import com.example.articleproject.entities.Article;
import com.example.articleproject.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService{
    @Autowired
    private ArticleRepository ar;


    @Override
    public Article addArticle(Article a) {
        return ar.save(a);
    }

    @Override
    public Article updateArticle(Article a) {
        return null;
    }

    @Override
    public List<Article> getAllArticles() {
        return (List<Article>) ar.findAll();
    }

    @Override
    public Article getArticleById(long id) {
        return null;
    }

    @Override
    public void deleteArticleById(long id) {

    }

    @Override
    public void deleteArticle(Article a) {

    }
}
