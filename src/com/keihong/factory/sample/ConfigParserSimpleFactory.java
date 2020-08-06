package com.keihong.factory.sample;

public class ConfigParserSimpleFactory {

    public static ConfigParser getConfigParser(String extension) {


        //获取可读取对应配置文件类型的解析器
//        if (extension.equalsIgnoreCase("json")) {
//            parser = ConfigParserFactoryManager.getParser()
//        } else if (extension.equalsIgnoreCase("xml")) {
//            parser = new XmlParserFactory().create();
//        } else if (extension.equalsIgnoreCase("properties")) {
//            parser = new PropertiesParserFactory().create();
//        } else {
//            throw new RuntimeException(extension + "格式文件暂不支持");
//        }
        ConfigParser parser = ConfigParserFactoryManager.getParser(extension);
        return parser;
    }
}
