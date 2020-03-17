package io.binac.designpattern.mediator;

import org.junit.jupiter.api.Test;

class ConcreteMediator implements Mediator {
    ConcreteColleague1 mColleague1 = new ConcreteColleague1(this);

    ConcreteColleague2 mColleague2 = new ConcreteColleague2(this);

    @Override
    public void onColleagueUpdated(Colleague colleague) {
        if (colleague == mColleague1) {
            System.out.println("Colleague1 changed");
        } else if (colleague == mColleague2) {
            System.out.println("Colleague2 changed");
        }
    }

    @Test
    void test() {
        mColleague1.update();
        mColleague2.update();
    }
}