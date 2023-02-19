package com.dailycodebuffer.dockerpublish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){

        return "Subscribe to daily code buffer";
    }
}