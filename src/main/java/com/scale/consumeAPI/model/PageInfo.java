package com.scale.consumeAPI.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

    @Entity
    @Table(name = "page")

    @XmlRootElement
    public class PageInfo {
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column
    private Integer page;
    @Column
    private Integer per_page;
    @Column
    private Integer total;
    @Column
    private Integer total_pages;

    public String getId(){
        return id;
    }

    public void setId(String id){
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

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

}
