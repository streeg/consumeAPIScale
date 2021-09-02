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


import com.scale.consumeAPI.dto.Metadata;
import com.scale.consumeAPI.model.PageInfo;
import com.scale.consumeAPI.service.PageService;

@CrossOrigin
@RestController
@RequestMapping("/pages")
public class PageController {


    @Autowired
    PageService pageService;


    RestTemplate template = new RestTemplate();

   
    UriComponents uri = UriComponentsBuilder.newInstance()
         .scheme("https")
         .host("reqres.in")
         .path("api/pages")
         .queryParam("fields", "all")

         .build();
    ResponseEntity<Metadata> entity = template.getForEntity(uri.toUriString(), Metadata.class);

    @RequestMapping("/all")
    public ArrayList<PageInfo> getAll() {
        return pageService.getAll();
    }


}

