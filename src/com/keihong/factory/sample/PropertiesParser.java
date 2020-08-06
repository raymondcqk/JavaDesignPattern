package com.keihong.factory.sample;

public class PropertiesParser implements ConfigParser{

    @Override
    public Config parse(String path) {
        return new Config("properties");
    }
}
