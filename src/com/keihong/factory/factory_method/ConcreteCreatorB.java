package com.keihong.factory.factory_method;

public class ConcreteCreatorB extends Creator{
    @Override
    Product createProduct() {
        return new ProductB();
    }
}
