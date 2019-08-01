package landsTest;

import lands.Forest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForestTest {

    Forest forest;

    @Before
    public void setUp() {
        forest = new Forest("The Dark Forest", "It's a spooky forest");
    }

    @Test
    public void hasName() {
        assertEquals("The Dark Forest", forest.getName());
    }

    @Test
    public void hasScenery() {
        assertEquals("It's a spooky forest", forest.getScenery());
    }
}
