package characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DwarfTest {

    Dwarf dwarf;
    Elf elf;

    @Before
    public void setUp() {
        dwarf = new Dwarf ("Gimli", 100, PlayerAttribute.AXE);
        elf = new Elf("Legolas", 80, PlayerAttribute.BOWARROW);
    }

    @Test
    public void hasName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasHealthPoints () {
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void hasAWeapon() {
        assertEquals(PlayerAttribute.AXE, dwarf.getAttribute());
    }

    @Test
    public void canAttack() {
        dwarf.attack(elf);
        assertEquals(73, elf.getHealthPoints());
    }

    @Test
    public void canDefendWithoutExtraAttr() {
        dwarf.defend(elf);
        assertEquals(96, dwarf.getHealthPoints());
    }

    @Test
    public void hasNoExtrasAtStart() {
        assertNull(dwarf.getExtra());
    }

    @Test
    public void canSetExtra(){
        dwarf.setExtra(PlayerAttribute.HELMET);
        assertEquals(PlayerAttribute.HELMET, dwarf.getExtra());
    }

//    @Test
//    public void extraHasAffect() {
//        dwarf.setExtra(PlayerAttribute.HELMET);
//        assertEquals(2, dwarf.defend());
//    }
}
