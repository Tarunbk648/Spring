package com.xworkz.hasa.fly;

import org.springframework.stereotype.Component;

@Component
public class Fly {
    private int flyId;

    Fly(){
        System.out.println("Fly Constructor Called");
    }

    public void setFlyId(int flyId) {
        this.flyId = flyId;
    }

    public int getFlyId() {
        return flyId;
    }
}
