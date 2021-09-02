package com.scale.consumeAPI.service;


import java.util.ArrayList;

import com.scale.consumeAPI.dto.Metadata;
import com.scale.consumeAPI.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService  {
    ArrayList<User> users = new ArrayList<>();
    public UserService(){
      
      
      for(int i = 0; i<entity.getBody().getData().size(); i++){

        User user = new User();
        user.setId(entity.getBody().getData().get(i).getId());
        user.setEmail(entity.getBody().getData().get(i).getEmail());
        user.setFirst_name(entity.getBody().getData().get(i).getFirst_name());
        user.setLast_name(entity.getBody().getData().get(i).getLast_name());
        user.setAvatar(entity.getBody().getData().get(i).getAvatar()); 
        users.add(user);

      }

    }

    public User getUser(String id){
        for(User user: users)
            if(user.getId().equalsIgnoreCase(id)){
                return user;
        
    }
    return null;
    }

    public ArrayList<User> getAll(){
        return users;
    }

    RestTemplate template = new RestTemplate();
    ResponseEntity<Metadata> entity = template.getForEntity("https://reqres.in/api/users", Metadata.class);
}
