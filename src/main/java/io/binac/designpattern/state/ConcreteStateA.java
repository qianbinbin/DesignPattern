package io.binac.designpattern.state;

public class ConcreteStateA implements State {
    private Context mContext;

    public ConcreteStateA(Context context) {
        mContext = context;
    }

    @Override
    public void handle() {
        new Throwable().printStackTrace();
        mContext.setState(mContext.getStateB());
    }
}
