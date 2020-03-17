package io.binac.designpattern.mediator;

public abstract class Colleague {
    protected Mediator mMediator;

    public Colleague(Mediator mediator) {
        mMediator = mediator;
    }

    public void update() {
        mMediator.onColleagueUpdated(this);
    }
}
