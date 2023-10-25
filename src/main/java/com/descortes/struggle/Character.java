package com.descortes.struggle;

public abstract class Character {

    private Integer damage;

    public Character(Integer damage){
        this.damage = damage;
    }

    public abstract Integer points(Location location);

    public Integer getDamage() {
        return damage;
    }
}
