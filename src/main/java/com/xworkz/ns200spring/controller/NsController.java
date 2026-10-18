package com.xworkz.ns200spring.controller;

import com.xworkz.ns200spring.dto.NsDto;
import com.xworkz.ns200spring.service.NsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class NsController {
    @Autowired
    NsService nsService;

    @PostMapping("save")
    public String saveData(NsDto nsDto){
        boolean isDataSaved= nsService.saveData(nsDto);
        if(isDataSaved){
            return "success";
        }
        else{
            return "error";
        }
    }
}
