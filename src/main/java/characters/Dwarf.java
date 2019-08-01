package characters;

public class Dwarf extends Character {

    private PlayerAttribute weapon;
    private PlayerAttribute extra;

    public Dwarf(String name, int healthPoints, PlayerAttribute weapon) {
        super(name, healthPoints, weapon);
        this.extra = null;
    }

    public PlayerAttribute getExtra() {
        return this.extra;
    }

    public void setExtra(PlayerAttribute extra) {
        this.extra = extra;
    }

}
