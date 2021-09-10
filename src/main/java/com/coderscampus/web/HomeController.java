package com.coderscampus.web;

import com.coderscampus.response.MarsRoverApiResponse;
import com.coderscampus.service.MarRoverApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller    // extend @Component annotation
public class HomeController {

    @Autowired   // field injection is not recommended
    private MarRoverApiService marRoverApiService;

    @GetMapping("/")
    public String getHomeView(ModelMap model, @RequestParam(required = false) String marsApiRoverData,
                              @RequestParam(required = false) Integer marsSol){
        if(StringUtils.isEmpty(marsApiRoverData)) {
            marsApiRoverData = "opportunity";
        }

        if(marsSol == null){
            marsSol = 1;
        }

        MarsRoverApiResponse roverData = marRoverApiService.getRoverData(marsApiRoverData, marsSol);
        model.put("roverDataKey", roverData);
        return "index";
    }


}
