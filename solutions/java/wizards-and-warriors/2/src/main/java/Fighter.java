class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

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
        // Otherwise, if fighter they are attacking is not vulnerable, return 6
        return fighter.isVulnerable() ? 10 : 6;
    }
}

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
        // If the Wizard hasn't prepared a spell in advanced, they are vulnerable. 
        // If they have prepared a spell, they are not vulnerable
        return !preparedSpell;
        
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        // A Wizard deals 12 points of damage if they prepared a spell in advance. Otherwise they deal 3 points of damage.
        return preparedSpell ? 12 : 3;
    }
}
