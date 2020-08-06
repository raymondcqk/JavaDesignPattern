package com.keihong.factory.sample;

import java.util.HashMap;

public class ConfigParserFactoryManager {

    private static HashMap<String, ConfigParserFactory> factoryMap;

    static {
        factoryMap = new HashMap<>();
        factoryMap.put("json", new JsonParserFactory());
        factoryMap.put("xml", new XmlParserFactory());
        factoryMap.put("properties", new PropertiesParserFactory());
        factoryMap.put("txt", new TxtParserFactory());
    }

    public static ConfigParser getParser(String type) {

        ConfigParserFactory configParserFactory = getConfigParserFactory(type);
        ConfigParser parser = configParserFactory.create();

        return parser;
    }

    private static ConfigParserFactory getConfigParserFactory(String type) {
        if (!factoryMap.containsKey(type)) {
            throw new RuntimeException("暂不支持该格式的解析器：" + type);
        }
        return factoryMap.get(type);
    }
}
