package com.descortes.struggle;

public class Night implements Location {
    @Override
    public Integer points(Character character) {
        if(character instanceof Vampire){
            return character.points() * 2;
        }
        return 0;
    }
}
