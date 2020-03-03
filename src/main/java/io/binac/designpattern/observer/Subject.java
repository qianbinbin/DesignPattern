package io.binac.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int mState;

    private List<Observer> mObservers = new ArrayList<>();

    public void setState(int state) {
        mState = state;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "State: " + mState;
    }

    public boolean addObserver(Observer o) {
        return mObservers.add(o);
    }

    public boolean removeObserver(Observer o) {
        return mObservers.remove(o);
    }

    private void notifyObservers() {
        for (Observer o : mObservers) {
            o.update(this);
        }
    }

    public interface Observer {
        void update(Subject subject);
    }
}
