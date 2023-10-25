package com.descortes.struggle;

public class Forest extends Location {
    @Override
    protected Integer pointsBy(Human human) {
        return 0;
    }

    @Override
    protected Integer pointsBy(Vampire vampire) {
        return 0;
    }

    @Override
    protected Integer pointsBy(Wolf wolf) {
        return wolf.getDamage() * 3;
    }
}
