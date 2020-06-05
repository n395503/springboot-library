package com.poc.cto.architecture;

public class TransformerName {

    private String originalName;

    public TransformerName(String name){
        this.originalName=name;
    }

    public String name2tranformerName(){
        if(this.originalName == null){
            return "Megatron: Tu nombre no puede ser explicado con palabras";
        }else{
            return originalName+"Tron";
        }
    }
}
