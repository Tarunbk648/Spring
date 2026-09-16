package com.xworkz.hasa.watch;

import com.xworkz.hasa.brand.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Watch {
    private int watchId;
    @Autowired
    private Brand brand;

    Watch(){
        System.out.println("Watch Constructor is Called");
    }

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getWatchId() {
        return watchId;
    }

    public Brand getBrand() {
        return brand;
    }
}
