package com.scale.consumeAPI.dto;

import java.util.List;

public class Metadata {
    private String id;
    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private List<Users> data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages){
        this.total_pages = total_pages;
    }

    public List<Users> getData() {
        return data;
    }

    public List<Users> setData(List<Users> data) {
        return this.data = data;
    }
}
