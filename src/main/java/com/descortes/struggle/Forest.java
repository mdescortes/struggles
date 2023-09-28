package com.descortes.struggle;

public class Forest implements Location {
    @Override
    public Integer points(Character character) {
        if(character instanceof Wolf){
            return character.points() * 3;
        }
        return 0;
    }
}
