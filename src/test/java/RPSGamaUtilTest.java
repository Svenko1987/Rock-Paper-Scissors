
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sven
 */
public class RPSGamaUtilTest {

    /**
     * Test of playGame method, of class RPSGamaUtil.
     * Sum of Player A wins, Player B wins 
     * and half the sum of Player A ties and Player B ties 
     * is expected to be equal to the number of rounds.
     */
    @Test
    public void testPlayFixGame() {
        Player pA = new Player("Player A", 0, 0);
        Player pB = new Player("Player B", 0, 0);
        Random R = new Random();
        RPSGameUtil.playFixGame(pA, pB, 1234, R);
        int expected = 1234;
        int result = pA.getWins() + pB.getWins() + ((pA.getTies() + pB.getTies()) / 2);
        assertEquals(expected, result);
    }

    /**
     * Test of printScore method, of class RPSGamaUtil.
     * Checking out if message that is printed contains desired substrings
     */
    @Test
    public void testPrintScore() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean expected = true;
        Player pA = new Player("Player A", 24, 26);
        Player pB = new Player("Player B", 50, 26);
        String substringA = "Player A wins 100 of 100 games";
        String substringB = "Player B wins 0 of 100 games";
        String substringT = "Tie 26 of 100 games";
        RPSGameUtil.printScore(pA, pB, 100);
        boolean result = false;
        if (outContent.toString().contains(substringA) || outContent.toString().contains(substringB) || outContent.toString().contains(substringT)) {
            result = true;
        } else {
        }
        assertEquals(expected, result);

    }

}
