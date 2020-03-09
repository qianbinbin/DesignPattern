package io.binac.designpattern.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

class ProxyTest {
    @Test
    void testStaticProxy() {
        Subject subject = new SubjectProxy();
        subject.request();
    }

    @Test
    void testDynamicProxy() {
        Subject subject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                new SubjectInvocationHandler(subject)
        );
        proxy.request();
    }
}