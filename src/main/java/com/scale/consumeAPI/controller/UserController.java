package com.scale.consumeAPI.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;


import com.scale.consumeAPI.dto.Metadata;
import com.scale.consumeAPI.dto.Users;
import com.scale.consumeAPI.model.User;
import com.scale.consumeAPI.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    RestTemplate template = new RestTemplate();

   
    UriComponents uri = UriComponentsBuilder.newInstance()
         .scheme("https")
         .host("reqres.in")
         .path("api/users")
         .queryParam("fields", "all")

         .build();
    ResponseEntity<Metadata> entity = template.getForEntity(uri.toUriString(), Metadata.class);

    @RequestMapping("/all")
    public ArrayList<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping("{page}")
     
    public List<Users> getUsers(@PathVariable Integer page){
        return (entity.getBody().getData());
    }


}

