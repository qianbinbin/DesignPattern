package io.binac.designpattern.state;

import org.junit.jupiter.api.Test;

class StateTest {
    @Test
    void test() {
        Context context = new Context();
        context.request();
        context.request();
    }
}