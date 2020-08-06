package com.keihong.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author keihong.chan email:keihong_chan@outlook.com
 * @date 2020/8/6 12:45 下午
 * @description 单例 - 懒汉模式 - 线程安全
 * 懒汉模式：延迟加载，只有在真正使用的时候，才开始实例化
 * - 线程安全问题 synchronized
 * - double check 加锁优化
 * - 编译器、CPU 字节码指令重排优化 volatile
 */
public class LazySingleton implements Serializable {

    static final long serialVersionUID = 1L;

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

    Object readResolve() throws ObjectStreamException {
        return LazySingleton.getInstance();
    }


    private int count = 10;



    public void add() {
        count += 10;
    }

    public void say() {
        System.out.println(count);
    }

}
