package com.descortes.struggle;

public class StruggleApp {
    public static String run(String locationType, String characterTypeA, String weaponTypeA, String characterTypeB, String weaponTypeB) {
        try {
            Location location = createLocation(locationType);
            Character characterA = createCharacter(characterTypeA);
            Character characterB = createCharacter(characterTypeB);
            Weapon weaponA =  createWeapon(weaponTypeA, characterA);
            Weapon weaponB =  createWeapon(weaponTypeB, characterB);

            Integer puntosA = characterA.points(location) +  weaponA.points();
            Integer puntosB = characterB.points(location) +  weaponB.points();

            if(puntosA > puntosB) return "Resultado: gana 1";
            if(puntosA < puntosB) return "Resultado: gana 2";
            return "Resultado: empate";

        }catch (Exception e){
            return e.getMessage();
        }
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
        if(characterType.equals("lobo")){
            return new Wolf();
        }
        if(characterType.equals("vampiro")){
            return new Vampire();
        }
        return null;
    }

    private static Location createLocation(String locationType) throws Exception {
        if(locationType.equals("estadio")){
            return new Stadium();
        }

        if(locationType.equals("ciudad")){
            return new City();
        }

        if(locationType.equals("noche")){
            return new Night();
        }

        if(locationType.equals("lluvia")){
            return new Rain();
        }

        if(locationType.equals("bosque")){
            return new Forest();
        }

        throw  new Exception("error: escenario desconocido");
    }


}
