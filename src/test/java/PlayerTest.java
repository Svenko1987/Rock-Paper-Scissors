
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sven
 */
public class PlayerTest {

    /**
     * Test of increaseWins method, of class Player.
     * The number of wins is supposed to change form 0 to 1.
     */
    @Test
    public void testIncreaseWins() {
        Player pA = new Player("Player A", 0, 0);
        pA.increaseWins();
        int expected = 1;
        int result = pA.getWins();
        assertEquals(expected, result);
    }

    /**
     * Test of increaseTies method, of class Player.
     * The number of ties is supposed to change form 0 to 1.
     */
    @Test
    public void testIncreaseTies() {
        Player pA = new Player("Player A", 0, 0);
        pA.increaseTies();
        int expected = 1;
        int result = pA.getTies();
        assertEquals(expected, result);
    }

}
