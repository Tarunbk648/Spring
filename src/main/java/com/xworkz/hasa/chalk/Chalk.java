package com.xworkz.hasa.chalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chalk {
    private int chalkId;
    private String color;

    @Autowired
    Chalk(@Value("White") String color){
        System.out.println("Chalk constructor called");
        this.color=color;
    }

    public void setChalkId(int chalkId) {
        this.chalkId = chalkId;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChalkId() {
        return chalkId;
    }

    public String getColor() {
        return color;
    }
}
