
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sven <celikovicsven@gmail.com>
 */
public class SignTest {

    /**
     * Test of getComperison method, of class Sign.
     * {@link Power} is expected to be WEAK when we compare {@link Sign} ROCK with {@link Sign} PAPER.
     */
    @Test
    public void testGetComperison() {
        Sign rock=Sign.ROCK;
        Power expected= Power.WEAK;
        Power result=rock.getComperison(Sign.PAPER);
        assertEquals(expected, result);
    }
    
}
