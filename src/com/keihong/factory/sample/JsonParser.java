package com.keihong.factory.sample;

public class JsonParser implements ConfigParser{

    @Override
    public Config parse(String path) {
        return new Config("json");
    }
}
