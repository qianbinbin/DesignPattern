package io.binac.designpattern.facade;

import org.junit.jupiter.api.Test;

class FacadeTest {
    @Test
    void test() {
        Facade facade = new Facade();
        facade.operation();
    }
}