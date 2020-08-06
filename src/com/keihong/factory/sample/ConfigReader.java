package com.keihong.factory.sample;

import com.keihong.factory.sample.util.FileUtils;

public class ConfigReader {

    /**
     * 读取配置
     *
     * @param path 配置文件路径
     * @return 配置信息对象
     */
    public static Config load(String path) {

        //确定配置文件类型
        String extension = FileUtils.getFileExtension(path);

        //获取对应的解析器
        ConfigParser parser = ConfigParserFactoryManager.getParser(extension);

        //解析得到配置对象
        Config config = parser.parse(path);

        return config;

    }


}
