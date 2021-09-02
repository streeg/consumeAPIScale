package com.scale.consumeAPI.dto;


    import java.util.List;

    public class Countries {

        private String id;
        private String code;
        private String name;
        private List<cNames> fronteiras;
        


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

        public List<cNames> getFronteiras() {
            return fronteiras;
        }

        public void setFronteiras(List<cNames> fronteiras) {
            this.fronteiras = fronteiras;
        }

    }
    