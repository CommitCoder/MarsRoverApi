package com.coderscampus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller    // extend @Component annotation
public class HomeController {


    @GetMapping("/")
    public String getHomeView(Model model){
        model.addAttribute("name", "name Page");
        model.addAttribute("address", "address Page");
        return "index";
    }


}
