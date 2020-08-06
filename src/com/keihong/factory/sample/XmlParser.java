package com.keihong.factory.sample;

public class XmlParser implements ConfigParser{

    @Override
    public Config parse(String path) {
        return new Config("xml");
    }
}
