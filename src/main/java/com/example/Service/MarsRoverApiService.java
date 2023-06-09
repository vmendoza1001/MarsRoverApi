package com.example.Service;

import com.example.Response.MarsRoverApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {
    public MarsRoverApiResponse getRoverData(String roverType) {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol=2&api_key=wiMniHzgTzXwGdDZE0JykxjobhVz6Aom745iNrWy",
                MarsRoverApiResponse.class);
        return response.getBody();
    }
}

