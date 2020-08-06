package com.keihong.factory.sample;

public class XmlParserFactory extends ConfigParserFactory {
    @Override
    protected ConfigParser creatorParser() {
        return new XmlParser();
    }
}
