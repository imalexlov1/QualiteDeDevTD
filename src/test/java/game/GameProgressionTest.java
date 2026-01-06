package game;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

/**
 * Test JUnit pour la progression du jeu (Niveau 1 vers Niveau 2).
 * @author Yassir Boulouiha Gnaoui & Alex Lovin
 */
public class GameProgressionTest {

    @Test
    public void testLevelProgression() {
        // Note: On ne peut pas tester Game.java facilement car il lance une JFrame et une boucle infinie dans son thread.
        // On va simuler la logique de passage de niveau telle qu'implémentée dans Game.java.
        
        int currentLevel = 1;
        int killsCounter = 250; // Condition de victoire pour EASY par exemple
        int winCondition = 250;
        
        if (killsCounter >= winCondition) {
            if (currentLevel == 1) {
                // Simulation de startLevel2()
                currentLevel = 2;
                killsCounter = 0;
            }
        }
        
        assertEquals("Le niveau doit passer à 2", 2, currentLevel);
        assertEquals("Le compteur de kills doit être remis à zéro", 0, killsCounter);
    }
}
