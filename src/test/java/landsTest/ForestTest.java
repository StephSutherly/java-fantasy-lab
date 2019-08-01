package landsTest;

import characters.Dwarf;
import characters.Elf;
import characters.PlayerAttribute;
import lands.Forest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForestTest {

    Forest forest;
    Elf elf;
    Dwarf dwarf;

    @Before
    public void setUp() {
        forest = new Forest("The Dark Forest", "It's a spooky forest");
        elf = new Elf("Legolas", 80, PlayerAttribute.BOWARROW);
        dwarf = new Dwarf("Gimli", 100, PlayerAttribute.AXE);
    }

    @Test
    public void hasName() {
        assertEquals("The Dark Forest", forest.getName());
    }

    @Test
    public void hasScenery() {
        assertEquals("It's a spooky forest", forest.getScenery());
    }

    @Test
    public void forestStartsEmpty() {
        assertEquals(0, forest.playerCount());
    }

    @Test
    public void canAddPlayers(){
        forest.addPlayer(elf);
        forest.addPlayer(dwarf);
        assertEquals(2, forest.playerCount());
    }
}
