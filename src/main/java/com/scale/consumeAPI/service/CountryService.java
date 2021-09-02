package com.scale.consumeAPI.service;
   

import java.util.ArrayList;

import com.scale.consumeAPI.dto.Countries;
import com.scale.consumeAPI.model.Country;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {
    

    ArrayList<Country> countries = new ArrayList<>();
    public CountryService(){
      
      
        Country country = new Country();
        country.setId(entity.getBody().getId());
        country.setCode(entity.getBody().getCode());
        country.setName(entity.getBody().getName());
        countries.add(country);

    }

    public Country getCountry(String id){
        for(Country country: countries)
            if(country.getId().equalsIgnoreCase(id)){
                return country;
        
        }
    return null;
    }

    public ArrayList<Country> getAll(){
        return countries;
    }

    RestTemplate template = new RestTemplate();
    ResponseEntity<Countries> entity = template.getForEntity("https://amock.io/api/fcmaia/countries", Countries.class);
}
