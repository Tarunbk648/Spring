package com.xworkz.hasa.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Article {
    private int articleId;
    private String articleName;

    @Autowired
    Article(@Value("The stone of throne") String articleName){
        System.out.println("Article Constructor is Called");
        this.articleName=articleName;
    }

    public int getArticleId() {
        return articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }
}
