package game;

import static org.junit.Assert.*;
import org.junit.Test;

public class MissileTowerTest {

    @Test
    public void testMissileTowerStats() {
        Coordinate pos = new Coordinate(100, 100);
        
        Missile missile = new Missile(pos);


        assertEquals("Le coût doit être de 60", 60, missile.getCost());
        assertEquals("La portée doit être de 100", 100, missile.getRange());
    }

    @Test
    public void testBlackHoleTowerStats() {
        BlackHole bh = new BlackHole(new Coordinate(0,0));
        assertEquals(100, bh.getCost());
    }

    @Test
    public void testSunTowerStats() {
        Sun sun = new Sun(new Coordinate(0,0));
        assertEquals(300, sun.getCost());
    }
}