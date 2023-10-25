package com.descortes.struggle;

public class Hand implements Weapon {

    private Character character;

    public Hand(Character character) {
        this.character = character;
    }

    @Override
    public Integer points() {
        return 0 + character.getDamage();
    }

}
