package com.example.articleproject.controllers;

import com.example.articleproject.entities.Article;
import com.example.articleproject.services.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService ias;
    @PostMapping("/addArticle")
    public Article ajouterArticle(@RequestBody Article a){
        return ias.addArticle(a);
    }


    @GetMapping("/getArticles")
    public List<Article> getAllContrat(){return ias.getAllArticles();}
}
