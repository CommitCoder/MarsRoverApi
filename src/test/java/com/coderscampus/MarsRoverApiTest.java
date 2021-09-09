package com.coderscampus;

import com.coderscampus.response.MarsRoverApiResponse;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverApiTest {


    @Test
    public void smallTest() {
        RestTemplate rt = new RestTemplate();
        String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=DEMO_KEY";
        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity(url, MarsRoverApiResponse.class);     // url that I'm calling and response type

        System.out.println(response.getBody());
    }


}
