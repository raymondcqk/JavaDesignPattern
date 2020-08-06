package com.keihong.factory.factory_method;

public class ConcreteCreatorC extends Creator{
    @Override
    Product createProduct() {
        return new ProductC();
    }
}
