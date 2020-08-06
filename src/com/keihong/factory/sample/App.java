package com.keihong.factory.sample;

public class App {

    public static void main(String[] args) {

        String configFilePath = "/user/kei/conf-v1.2.txt" ;
        Config conf = ConfigReader.load(configFilePath);
        conf.print();


    }
}
