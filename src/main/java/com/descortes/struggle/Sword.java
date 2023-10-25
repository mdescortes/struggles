package com.descortes.struggle;

public class Sword implements Weapon {

    private Character character;

    public Sword(Character character) {
        this.character = character;
    }

    @Override
    public Integer points() {
        return 2 * character.getDamage();
    }
}
