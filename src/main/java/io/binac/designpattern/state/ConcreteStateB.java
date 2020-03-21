package io.binac.designpattern.state;

public class ConcreteStateB implements State {
    private Context mContext;

    public ConcreteStateB(Context context) {
        mContext = context;
    }

    @Override
    public void handle() {
        new Throwable().printStackTrace();
        mContext.setState(mContext.getStateA());
    }
}
