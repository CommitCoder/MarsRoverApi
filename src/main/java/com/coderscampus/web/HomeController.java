package com.coderscampus.web;

import com.coderscampus.response.MarsRoverApiResponse;
import com.coderscampus.service.MarRoverApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller    // extend @Component annotation
public class HomeController {

    @Autowired   // field injection is not recommended
    private MarRoverApiService marRoverApiService;

    @GetMapping("/")
    public String getHomeView(ModelMap model){
        // opportunity, spirit curiosity
        MarsRoverApiResponse roverData = marRoverApiService.getRoverData("spirit");
        model.put("roverDataKey", roverData);
        return "index";
    }

}
