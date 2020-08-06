package com.keihong.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectAttackTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        HungrySingleton instance = HungrySingleton.getInstance();
        Constructor<HungrySingleton> declaredConstructor = HungrySingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungrySingleton instance1 = declaredConstructor.newInstance();


        System.out.println(instance == instance1);

    }


}
