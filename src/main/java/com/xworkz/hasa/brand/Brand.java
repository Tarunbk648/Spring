package com.xworkz.hasa.brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Brand {
    private int brandId;

    Brand(){
        System.out.println("Brand Constructor Called");
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getBrandId() {
        return brandId;
    }
}
