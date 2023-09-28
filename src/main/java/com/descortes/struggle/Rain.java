package com.descortes.struggle;

public class Rain implements Location {
    @Override
    public Integer points(Character character) {
        if(character instanceof Vampire){
            return character.points() - 1;
        }
        return 0;
    }
}
