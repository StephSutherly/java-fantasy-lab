import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void setUp() {
        dwarf = new Dwarf("Gimli", 100, PlayerAttribute.AXE);
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
    public void canAttack() {
        assertEquals(-7, dwarf.attack(PlayerAttribute.AXE));
    }
}
