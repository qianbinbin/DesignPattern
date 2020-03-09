package io.binac.designpattern.proxy;

public class SubjectProxy implements Subject {
    private RealSubject mSubject;

    @Override
    public void request() {
        if (mSubject == null)
            mSubject = new RealSubject();
        mSubject.request();
    }
}
