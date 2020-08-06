package com.keihong.factory.sample;

public abstract class ConfigParserFactory {

    protected abstract ConfigParser creatorParser();

    public ConfigParser create() {
        ConfigParser parser = creatorParser();
        // 通用初始化配置过程 ...
        return parser;
    }

}
