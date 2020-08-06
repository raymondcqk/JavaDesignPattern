package com.keihong.factory.sample.util;

public class FileUtils {

    public static String getFileExtension(String path) {
        String suffix = path.substring(path.lastIndexOf('.') + 1);
        return suffix;
    }
}
