package characters;

public abstract class Fighter extends Character {


    public Fighter(String name, int healthPoints, PlayerAttribute attribute) {
        super(name, healthPoints, attribute);

    }

    public PlayerAttribute getWeapon() {
        return this.attribute;
    }

    public void setWeapon(PlayerAttribute weapon) {
        this.attribute = weapon;
    }


//    abstract public void defend(Character opponent);

}
