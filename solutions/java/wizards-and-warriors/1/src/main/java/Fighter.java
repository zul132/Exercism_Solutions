class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        // If the fighter they are attacking is vulnerable, return 10 points of damage
        if (fighter.isVulnerable()) {
            return 10;
        } // If the fighter they are attacking is not vulnerable, return 6
        else {
            return 6;
        }
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {
    // initially, the Wizard hasn't prepared a spell
    private boolean preparedSpell = false;
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        this.preparedSpell = true;
    }

    @Override
    boolean isVulnerable() {
        // If the Wizard hasn't prepared a spell, then make them vulnerable
        if (!preparedSpell) {
            return true;
        }
        
        // returns false only when a spell is prepared.
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        // A Wizard deals 12 points of damage if they prepared a spell in advance.
        if (preparedSpell) {
            return 12;
        } // 3 points of damage if they did not prepare a spell in advance
        else {
            return 3;
        } 
    }
}
