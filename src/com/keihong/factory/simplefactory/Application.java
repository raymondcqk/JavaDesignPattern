package com.keihong.factory.simplefactory;

public class Application {

    public static ProductSimpleFactory.ProductVersion productVer = ProductSimpleFactory.ProductVersion.V5;


    public static void main(String[] args) {
        testPlayer();

    }

    private static void testPlayer() {
        String testCd = "渡口";
        Product product = ProductSimpleFactory.create(productVer);
        product.play(testCd);
    }
}
