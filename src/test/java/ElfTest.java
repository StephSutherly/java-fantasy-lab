import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ElfTest {

    Elf elf;

    @Before
    public void setUp() {
        elf = new Elf("Legolas", 80, PlayerAttribute.BOWARROW);
    }

    @Test
    public void hasName() {
        assertEquals("Legolas", elf.getName());
    }

    @Test
    public void hasHealthPoints () {
        assertEquals(80, elf.getHealthPoints());
    }

    @Test
    public void canAttack() {
        assertEquals(-4, elf.attack(PlayerAttribute.BOWARROW));
    }

    @Test
    public void hasNoExtrasAtStart() {
        assertNull(elf.getExtra());
    }

    @Test
    public void canSetExtra(){
        elf.setExtra(PlayerAttribute.SHEILD);
        assertEquals(PlayerAttribute.SHEILD, elf.getExtra());
    }

    @Test
    public void extraHasAffect() {
        elf.setExtra(PlayerAttribute.SHEILD);
        assertEquals(1, elf.defend());
    }

//    @Test
//    public void canDodge() {
////        create enemy and negate enemy attack because dodge
//    }
}
