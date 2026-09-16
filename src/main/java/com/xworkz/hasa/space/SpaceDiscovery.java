package com.xworkz.hasa.space;

import com.xworkz.hasa.fly.Fly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpaceDiscovery {
    private int spaceId;
    @Autowired
    private Fly fly;


    SpaceDiscovery(){
        System.out.println("SpaceDiscovery is constructor is called");
    }

    public Fly getFly() {
        return fly;
    }

    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }
}
