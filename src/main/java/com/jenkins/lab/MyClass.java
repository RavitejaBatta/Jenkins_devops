package com.jenkins.lab;

public class MyClass {

    private  String name;
    private Integer id;
    private Integer secret;

    public Integer calculatorKey(){

        return id * secret ;
    }
    public String getName(){

        return name ;
    }
    public void setName( String name){
        this.name = name;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getSecret(){
        return secret;
    }

    public  void setSecret(Integer secret){
        this.secret = secret;
    }
}
