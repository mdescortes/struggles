package com.descortes.struggle;

public class Rain extends Location {
    @Override
    protected Integer pointsBy(Human human) {
        return 0;
    }

    @Override
    protected Integer pointsBy(Vampire vampire) {
        return vampire.getDamage() - 1;
    }

    @Override
    protected Integer pointsBy(Wolf stadium) {
        return 0;
    }
}
