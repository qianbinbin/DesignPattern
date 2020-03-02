package io.binac.designpattern.builder;

import org.junit.jupiter.api.Test;

class BuilderTest {
    @Test
    void test() {
        Product product = new Product.Builder().setA(1).setB(2).build();
        System.out.println(product);
    }
}