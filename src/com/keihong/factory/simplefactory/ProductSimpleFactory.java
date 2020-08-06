package com.keihong.factory.simplefactory;

public class ProductSimpleFactory {

    public static Product create(ProductVersion ver) {
        Product product;
        switch (ver) {
            case V1:
                product = new Product1();
                break;
            case V2:
                product = new Product2();
                break;
            case V3:
                product = new Product3();
                break;
            case V4:
                throw new RuntimeException("v4 is not ready");
            default:
                throw new RuntimeException("product version is not exits");
        }

        return product;
    }


    public enum ProductVersion {
        V1, V2, V3, V4, V5
    }
}
