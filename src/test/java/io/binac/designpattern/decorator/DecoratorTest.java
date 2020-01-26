package io.binac.designpattern.decorator;

import org.junit.jupiter.api.Test;

class DecoratorTest {
    @Test
    void test() {
        Coffee coffee = new Espresso();
        System.out.println(coffee);

        coffee = new WithMilk(coffee);
        System.out.println(coffee);

        coffee = new WithSprinkles(coffee);
        System.out.println(coffee);
    }
}