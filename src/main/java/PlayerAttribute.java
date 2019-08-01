public enum PlayerAttribute {

//    Weapons
    SWORD(-5),
    AXE(-7),
    BOWARROW(-4);

    private final int baseAffect;

    PlayerAttribute(int baseAffect) {
        this.baseAffect = baseAffect;
    }

    public int getBaseAffect() {
        return baseAffect;
    }
}
