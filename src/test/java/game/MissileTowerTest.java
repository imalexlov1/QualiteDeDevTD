package game;

import static org.junit.Assert.*;
import org.junit.Test;

public class MissileTowerTest {

    @Test
    public void testMissileTowerStats() {
        Coordinate pos = new Coordinate(100, 100);
        
        Missile missile = new Missile(pos);


        assertEquals("Le coût doit être de 60", 60, missile.getCost());
        assertEquals("La portée doit être de 20", 20, missile.getRange());
    }
}