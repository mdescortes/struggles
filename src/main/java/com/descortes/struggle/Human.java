package com.descortes.struggle;


public class Human extends Character {

    public Human() {
        super(1);
    }

    @Override
    public Integer points(Location location) {
        return this.getDamage() + location.pointsBy(this);
    }

}
