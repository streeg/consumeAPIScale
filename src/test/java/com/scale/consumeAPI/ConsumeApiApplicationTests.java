package com.scale.consumeAPI;

import com.scale.consumeAPI.dto.Metadata;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConsumeApiApplicationTests {

	@Test
	public void consumerAPI() {
		RestTemplate template = new RestTemplate();

		// https://reqres.in/api/users

		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("reqres.in")
				.path("api/users")
				.queryParam("fields", "all")

				.build();

		ResponseEntity<Metadata> entity = template.getForEntity(uri.toUriString(), Metadata.class);
		System.out.println(entity.getBody().getData().get(0).getFirst_name());

	}
	
}
