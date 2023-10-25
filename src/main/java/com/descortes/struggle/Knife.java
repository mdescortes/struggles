package com.descortes.struggle;

public class Knife implements Weapon {
    private Character character;

    public Knife(Character character) {
        this.character = character;
    }

    @Override
    public Integer points() {
        return 2 + character.getDamage();
    }
}
