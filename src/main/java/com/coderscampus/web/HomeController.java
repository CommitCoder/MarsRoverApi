package com.coderscampus.web;

import com.coderscampus.dto.HomeDto;
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
    public String getHomeView(ModelMap model, HomeDto homeDto){
        if(StringUtils.isEmpty(homeDto.getMarsApiRoverData())) {
            homeDto.setMarsApiRoverData("opportunity");
        }

        if(homeDto.getMarsSol() == null){
            homeDto.setMarsSol(1);
        }

        MarsRoverApiResponse roverData = marRoverApiService.getRoverData(homeDto.getMarsApiRoverData(), homeDto.getMarsSol());
        model.put("roverDataKey", roverData);
        model.put("homeDtoKey", homeDto); // we want to access homeDto from index.html now
        return "index";
    }


}
