package com.keihong.singleton;

/**
 * @author keihong.chan email:keihong_chan@outlook.com
 * @date 2020/8/6 12:45 下午
 * @description 单例 - 懒汉模式 - 线程安全
 * 懒汉模式
 * double check 加锁优化
 * 字节码指令重排优化
 */
public class LazySingleton {

    private volatile static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
