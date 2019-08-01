package characters;

public enum PlayerAttribute {

//    Weapons
    SWORD(-5),
    AXE(-7),
    BOWARROW(-4),

// Extra affects

    HELMET(2),
    SHEILD( 1),
    CLOAK(2);

    private final int baseAffectOnHP;

    PlayerAttribute(int baseAffectOnHP) {
        this.baseAffectOnHP = baseAffectOnHP;
    }

    public int getBaseAffect() {
        return baseAffectOnHP;
    }
}
