import org.junit.Test;
import static org.junit.Assert.*;

public class DifficultyTest {

    @Test
    public void testEasyModeConfiguration() {
        // J'imagine une Enum ou une classe qui porte les config
        GameProfile profile = GameDifficulty.EASY.getProfile();
        
        assertEquals("L'argent de départ doit être 400", 400, profile.startMoney);
        assertEquals("Les vies doivent être 20", 20, profile.startLives);
        assertEquals("Objectif de kills doit être 250", 250, profile.winCondition);
    }

    @Test
    public void testHardModeConfiguration() {
        GameProfile profile = GameDifficulty.HARD.getProfile();
        
        assertEquals(100, profile.startMoney);
        assertEquals(5, profile.startLives);
        assertEquals(1000, profile.winCondition);
    }
}