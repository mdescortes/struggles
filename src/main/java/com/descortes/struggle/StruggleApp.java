package com.descortes.struggle;

public class StruggleApp {
    public static String run(String locationType, String characterTypeA, String weaponTypeA, String characterTypeB, String weaponTypeB) {

        Location location = createLocation(locationType);
        Character characterA = createCharacter(characterTypeA);
        Character characterB = createCharacter(characterTypeB);
        Weapon weaponA =  createWeapon(weaponTypeA, characterA);
        Weapon weaponB =  createWeapon(weaponTypeB, characterB);


        Integer puntosA = location.points() +  weaponA.points();
        Integer puntosB = location.points() +  weaponB.points();

        if(puntosA > puntosB) return "Resultado: gana 1";
        if(puntosA < puntosB) return "Resultado: gana 2";
        return "Resultado: empate";
    }

    private static Weapon createWeapon(String weaponType, Character character) {
        if(weaponType.equals("espada")){
            return new Sword(character);
        }
        if(weaponType.equals("mano")){
            return new Hand(character);
        }
        if(weaponType.equals("cuchillo")){
            return new Knife(character);
        }

        return null;
    }

    private static Character createCharacter(String characterType) {
        if(characterType.equals("humano")){
            return new Human();
        }
        return null;
    }

    private static Stadium createLocation(String locationType) {
        if(locationType.equals("estadio")){
            return new Stadium();
        }

        return null;
    }


}
