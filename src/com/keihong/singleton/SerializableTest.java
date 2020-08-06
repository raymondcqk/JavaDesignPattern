package com.keihong.singleton;

import java.io.*;

public class SerializableTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SerializableTest"));
        LazySingleton object = (LazySingleton) ois.readObject();
        ois.close();

        System.out.println(LazySingleton.getInstance() == object);

        object.say();



        LazySingleton instance = LazySingleton.getInstance();
        instance.say();
        instance.add();
        instance.say();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerializableTest"));
        oos.writeObject(instance);
        oos.close();



    }
}
