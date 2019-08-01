package characters;

public abstract class Character {

    private String name;
    private int healthPoints;
    protected PlayerAttribute attribute;
//    private ArrayList<Treasure> moneyBag;


    public Character(String name, int healthPoints, PlayerAttribute attribute) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void attack(Character opponent) {
        int attackOutCome = opponent.getHealthPoints() + this.attribute.getBaseAffect();
        opponent.setHealthPoints(attackOutCome);
    }

//    public abstract void defend(Character opponent);

}
