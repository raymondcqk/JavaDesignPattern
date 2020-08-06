package com.keihong.singleton;

/**
 * @author keihong.chan email:keihong_chan@outlook.com
 * @date 2020/8/6 2:46 下午
 * @description 单例 - 饿汉转懒汉 - 线程安全的懒汉模式 基于JVM类加载机制
 */
public class HungrySingleton {

    private static class HungrySingletonHolder {
        private static HungrySingleton instance = new HungrySingleton();
    }

    private HungrySingleton() {
        if (HungrySingletonHolder.instance!=null){
            throw new RuntimeException("单例不允许new多个实例");
        }
    }

    public static HungrySingleton getInstance() {
        return HungrySingletonHolder.instance;
    }

}
