package characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EnemyTest {

    Dwarf dwarf;
    Elf elf;
    Enemy enemy;

    @Before
    public void setUp() {
        dwarf = new Dwarf ("Gimli", 100, PlayerAttribute.AXE);
        elf = new Elf("Legolas", 80, PlayerAttribute.BOWARROW);
        enemy = new Enemy("Evil Tree Lady", 40, PlayerAttribute.SLIMYFINGERS);
    }

    @Test
    public void hasName() {
        assertEquals("Evil Tree Lady", enemy.getName());
    }

    @Test
    public void hasHealthPoints () {
        assertEquals(40, enemy.getHealthPoints());
    }

    @Test
    public void hasAWeapon() {
        assertEquals(PlayerAttribute.SLIMYFINGERS, enemy.getAttribute());
    }

//    attack() needs to be overwritten at subclass level to account for defence ORRR extra attribute required at top level
    @Test
    public void canAttackWithNoOpponentDefense() {
        enemy.attack(dwarf);
        assertEquals(98, dwarf.getHealthPoints());
    }


    @Test
    public void canDefend() {
        enemy.defend(dwarf);
        assertEquals(33, enemy.getHealthPoints());
    }

}