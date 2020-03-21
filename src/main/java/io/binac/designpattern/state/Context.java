package io.binac.designpattern.state;

public class Context {
    private State mState;
    private State mStateA;
    private State mStateB;

    void setState(State state) {
        mState = state;
    }

    State getStateA() {
        return mStateA;
    }

    State getStateB() {
        return mStateB;
    }

    public Context() {
        mStateA = new ConcreteStateA(this);
        mStateB = new ConcreteStateB(this);
        mState = mStateA;
    }

    public void request() {
        mState.handle();
    }
}
