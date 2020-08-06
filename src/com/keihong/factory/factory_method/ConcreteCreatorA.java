package com.keihong.factory.factory_method;

public class ConcreteCreatorA extends Creator{
    @Override
    Product createProduct() {
        return new ProductA();
    }
}
