public abstract class Fighter extends Player {

    private PlayerAttribute weapon;

    public Fighter(String name, int healthPoints, PlayerAttribute weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public PlayerAttribute getWeapon() {
        return weapon;
    }

    public void setWeapon(PlayerAttribute weapon) {
        this.weapon = weapon;
    }

    abstract public int attack(PlayerAttribute weapon);
}
