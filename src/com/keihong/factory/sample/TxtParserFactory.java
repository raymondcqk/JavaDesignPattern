package com.keihong.factory.sample;

public class TxtParserFactory extends ConfigParserFactory {
    @Override
    protected ConfigParser creatorParser() {
        return new TxtParser();
    }
}
