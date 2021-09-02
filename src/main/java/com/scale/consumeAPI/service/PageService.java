package com.scale.consumeAPI.service;

import java.util.ArrayList;

import com.scale.consumeAPI.dto.Metadata;
import com.scale.consumeAPI.model.PageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PageService {
    

    ArrayList<PageInfo> pages = new ArrayList<>();
    public PageService(){
      
      
        PageInfo page = new PageInfo();
        page.setId(entity.getBody().getId());
        page.setPage(entity.getBody().getPage());
        page.setPer_page(entity.getBody().getPer_page());
        page.setTotal(entity.getBody().getTotal());
        page.setTotal_pages(entity.getBody().getTotal_pages()); 
        pages.add(page);

    }

    public PageInfo getPage(String id){
        for(PageInfo page: pages)
            if(page.getId().equalsIgnoreCase(id)){
                return page;
        
        }
    return null;
    }

    public ArrayList<PageInfo> getAll(){
        return pages;
    }

    RestTemplate template = new RestTemplate();
    ResponseEntity<Metadata> entity = template.getForEntity("https://reqres.in/api/pages", Metadata.class);
}
