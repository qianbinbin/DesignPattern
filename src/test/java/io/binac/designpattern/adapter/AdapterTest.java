package io.binac.designpattern.adapter;

import org.junit.jupiter.api.Test;

class AdapterTest {
    @Test
    void testObjectAdapter() {
        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }

    @Test
    void testClassAdapter() {
        Target target = new ClassAdapter();
        target.request();
    }
}