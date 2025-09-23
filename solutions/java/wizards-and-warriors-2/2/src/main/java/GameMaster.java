public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character) {
        return String.format("You're a level %d %s with %d hit points.", 
                            character.getLevel(),
                            character.getCharacterClass(),
                            character.getHitPoints());
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %d inhabitants.", 
                            destination.getName(),
                            destination.getInhabitants());
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod) {
        switch(travelMethod) {
            case WALKING:
                return "You're traveling to your destination by walking.";
            case HORSEBACK:
                return "You're traveling to your destination on horseback.";
            default:
                return "Error: Invalid Travel Method!";
        }
    }
    
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return String.join(" ", describe(character), describe(travelMethod), describe(destination));
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
