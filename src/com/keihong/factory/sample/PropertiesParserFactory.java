package com.keihong.factory.sample;

public class PropertiesParserFactory extends ConfigParserFactory {
    @Override
    protected ConfigParser creatorParser() {
        return new PropertiesParser();
    }
}
