package com.descortes.struggle;

public class City implements Location {
    @Override
    public Integer points(Character character) {

        if(character instanceof Human ) return character.points() * 2;
        return 0;
    }
}
