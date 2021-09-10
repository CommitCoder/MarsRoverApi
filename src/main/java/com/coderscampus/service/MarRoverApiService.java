package com.coderscampus.service;


import com.coderscampus.response.MarsRoverApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarRoverApiService {

    private static final String API_KEY = "iXHEWz6RWuPpUVHUNicKvpLzDO30NzRNNh4IlnDX";

    public MarsRoverApiResponse getRoverData(String roverType, Integer marsSol){
        RestTemplate rt = new RestTemplate();
        String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/" +roverType +"/photos?sol=" + marsSol + "&api_key=" + API_KEY;
        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity(url, MarsRoverApiResponse.class);     // url that I'm calling and response type
        return response.getBody();
    }




}
