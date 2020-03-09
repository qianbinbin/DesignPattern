package io.binac.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectInvocationHandler implements InvocationHandler {
    private Subject mSubject;

    public SubjectInvocationHandler(Subject subject) {
        mSubject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoking " + method);
        Object result = method.invoke(mSubject, args);
        System.out.println("invoked " + method);
        return result;
    }
}
