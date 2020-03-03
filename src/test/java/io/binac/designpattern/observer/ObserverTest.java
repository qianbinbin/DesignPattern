package io.binac.designpattern.observer;

import org.junit.jupiter.api.Test;

class ObserverTest {
    @Test
    void test() {
        Subject subject = new Subject();
        subject.setState(0);

        Subject.Observer so = System.out::println;
        subject.addObserver(so);
        subject.setState(1);

        subject.removeObserver(so);
        subject.setState(2);
    }
}