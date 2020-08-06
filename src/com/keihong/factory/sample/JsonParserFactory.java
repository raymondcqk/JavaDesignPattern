package com.keihong.factory.sample;

public class JsonParserFactory extends ConfigParserFactory {
    @Override
    protected ConfigParser creatorParser() {
        // ... 独立的初始化配置
        return new JsonParser();
    }
}
