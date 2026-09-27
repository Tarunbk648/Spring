package com.xworkz.drive.controller;


import com.xworkz.drive.dto.DriveDto;
import com.xworkz.drive.service.DriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RequestMapping("/")
@Controller
public class DriveController {

    @Autowired
    DriveService driveService;

    @PostMapping("save")
    public String SaveData(DriveDto driveDto){
       boolean isDataSaved=driveService.saveData(driveDto);

        if(isDataSaved){
            return "success";
        }
        else{
            return "error";
        }
    }


    @GetMapping("getAccounts")
    public String getAccount(Model model){
       List<DriveDto> dto=driveService.getAllAccount();
       model.addAttribute("dtos", dto);
       return "getAllDetails";
    }

    @GetMapping("update")
    public String updateById(@RequestParam("id") String id, Model model){
        DriveDto driveDto=driveService.updateById(Integer.parseInt(id));
        model.addAttribute("ById", driveDto);
        return "setData";
    }

    @PostMapping("set")
    public RedirectView setData(DriveDto driveDto, HttpServletRequest req){
        driveService.setData(driveDto);
        RedirectView redirectView= new RedirectView();
        redirectView.setUrl(req.getContextPath()+"/getAccounts");
        return  redirectView;
    }

    @GetMapping("delete")
    public RedirectView deleteData(@RequestParam("id") String id, HttpServletRequest httpServletRequest){
        driveService.deleteData(Integer.parseInt(id));
        RedirectView redirectView= new RedirectView();
        redirectView.setUrl(httpServletRequest.getContextPath()+"/getAccounts");
        return  redirectView;
    }


}
