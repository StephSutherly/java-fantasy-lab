package characters;

public class Elf extends Character {

    private PlayerAttribute extra;

    public Elf(String name, int healthPoints, PlayerAttribute weapon) {
        super(name, healthPoints, weapon);
        this.extra = null;
    }

    public PlayerAttribute getExtra() {
        return this.extra;
    }

    public void setExtra(PlayerAttribute extra) {
        this.extra = extra;
    }

    public void defend(Character opponent) {
        PlayerAttribute opponentWeapon = opponent.getAttribute();
        PlayerAttribute extra = (PlayerAttribute.SHEILD);
        int defendingPoints = getHealthPoints() + extra.getBaseAffect();
        int result = defendingPoints + opponentWeapon.getBaseAffect();
        setHealthPoints(result);

    }

//
//    dodge()

}