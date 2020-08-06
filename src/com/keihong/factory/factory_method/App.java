package com.keihong.factory.factory_method;

public class App {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreatorB();
        creator.getObject().play();
    }
}
