package com.keihong.factory.factory_method;

public abstract class Creator {

    abstract Product createProduct();

    Product getObject() {

        Product product = createProduct();
        // ...
        // 初始化过程
        return product;
    }

}
