package com.descortes.struggle;

public class Wolf extends Character {

    public Wolf() {
        super(3);
    }

    @Override
    public Integer points(Location location) {
        return this.getDamage() + location.pointsBy(this);
    }
}
