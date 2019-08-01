public class Dwarf extends Fighter {

    private PlayerAttribute weapon;
    private PlayerAttribute extra;

    public Dwarf(String name, int healthPoints, PlayerAttribute weapon) {
        super(name, healthPoints, weapon);
        this.extra = null;
    }

    public int attack(PlayerAttribute weapon) {
        return weapon.getBaseAffect();
    }

}
