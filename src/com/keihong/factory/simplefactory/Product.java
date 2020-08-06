package com.keihong.factory.simplefactory;

public abstract class Product {

    public void play(String content) {
        System.out.println(String.format("PlayEngine(_%s_) play:%s", getEngine(), content));
    }

    abstract String getEngine();
}
