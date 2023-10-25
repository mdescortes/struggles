package com.descortes.struggle;

public class Vampire extends Character {

    public Vampire() {
        super(2);
    }

    @Override
    public Integer points(Location location) {
        return this.getDamage() + location.pointsBy(this);
    }
}
