package com.xworkz.hasa.paper;

import com.xworkz.hasa.article.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
    private int paperId;
    @Autowired
    private Article article;

    NewsPaper(){
        System.out.println("NewsPaper Constructor Called");
    }

    public int getPaperId() {
        return paperId;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }
}
