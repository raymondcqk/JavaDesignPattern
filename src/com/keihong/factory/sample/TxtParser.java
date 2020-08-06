package com.keihong.factory.sample;

public class TxtParser implements ConfigParser{

    @Override
    public Config parse(String path) {
        return new Config("txt");
    }
}
