package com.scale.consumeAPI.controller;

    

    import org.springframework.web.bind.annotation.CrossOrigin;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.client.RestTemplate;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.util.UriComponents;
    import org.springframework.web.util.UriComponentsBuilder;
    
    import java.util.ArrayList;

import com.scale.consumeAPI.dto.Countries;
import com.scale.consumeAPI.model.Country;
import com.scale.consumeAPI.service.CountryService;
    
    @CrossOrigin
    @RestController
    @RequestMapping("/countries")
    public class CountryController {
    
        @Autowired
        CountryService countryService;
    
    
        RestTemplate template = new RestTemplate();
    
       //https://amock.io/api/fcmaia/countries
       
        UriComponents uri = UriComponentsBuilder.newInstance()
             .scheme("https")
             .host("amock.io")
             .path("api/fcmaia/countries")
    
             .build();

        ResponseEntity<Countries> entity = template.getForEntity(uri.toUriString(), Countries.class);
    
        @RequestMapping("/all")
        public ArrayList<Country> getAll() {
            return countryService.getAll();
        }
    
    }
    
    