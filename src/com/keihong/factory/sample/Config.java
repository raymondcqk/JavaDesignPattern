package com.keihong.factory.sample;

public class Config {

    private String type;

    public Config(String type) {
        this.type = type;
    }


    public void print(){
        System.out.println(type);
    }
}
