package com.descortes.struggle;

public class City extends Location {
    @Override
    protected Integer pointsBy(Human human) {
        return human.getDamage() * 2;
    }

    @Override
    protected Integer pointsBy(Vampire vampire) {
        return 0;
    }

    @Override
    protected Integer pointsBy(Wolf stadium) {
        return 0;
    }
}
