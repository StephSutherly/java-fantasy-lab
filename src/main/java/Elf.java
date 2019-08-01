public class Elf extends Fighter {

    private PlayerAttribute weapon;
    private PlayerAttribute extra;

    public Elf(String name, int healthPoints, PlayerAttribute weapon) {
        super(name, healthPoints, weapon);
        this.extra = null;
    }

    public int attack(PlayerAttribute weapon) {
        return weapon.getBaseAffect();
    }

    public PlayerAttribute getExtra() {
        return this.extra;
    }

    public void setExtra(PlayerAttribute extra) {
        this.extra = extra;
    }

    public int defend() {
        return this.extra.getBaseAffect();
    }

//    dodge() 

}