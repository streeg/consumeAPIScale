package com.scale.consumeAPI.model;


    import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
    import javax.xml.bind.annotation.XmlRootElement;
    
        @Entity
        @Table(name = "country")
    
        @XmlRootElement
        public class Country {
        
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private String id;
        @Column
        private String code;
        @Column
        private String name;
        @Column
        @ElementCollection()
        private List<String> fronteiras = new ArrayList<String>();

        public String getId(){
            return id;
        }
    
        public void setId(String id){
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getFronteiras() {
            return fronteiras;
        }

        public void setFronteiras(List<String> fronteiras) {
            this.fronteiras = fronteiras;
        }

    }
    