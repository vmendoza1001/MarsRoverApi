package com.example;

import com.example.Response.MarsRoverApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class MarsRoverApiTest {

	@Test
	public void smallTest() {
		RestTemplate rt = new RestTemplate();

		ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=wiMniHzgTzXwGdDZE0JykxjobhVz6Aom745iNrWy",
				MarsRoverApiResponse.class);
        System.out.println(response.getBody());


	}

}
