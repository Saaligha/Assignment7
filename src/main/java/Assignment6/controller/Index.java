package Assignment6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {


    @GetMapping("/premiumuser")
    @ResponseBody
    public String premiumUser(){
        return "welcome premium user";
    }

    @GetMapping("/")
    @ResponseBody
    public String homePage(){
        return "Home page";
    }
}
