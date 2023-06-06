package com.example.Controllers;

import com.example.Response.MarsRoverApiResponse;
import com.example.Service.MarsRoverApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    private MarsRoverApiService roverService;
    @GetMapping("/")
    public String getHomeView (ModelMap model) {
       MarsRoverApiResponse roverData = roverService.getRoverData("opportunity");
       model.put("roverData", roverData);
       return "index";
    }

    @PostMapping("/")
    public String postHOmeView (ModelMap model, @RequestParam String marsApiRoverData){
        MarsRoverApiResponse roverData = roverService.getRoverData("opportunity");
        model.put("roverData", roverData);
        return "index";
    }

}
