

import java.util.Random;

/**
 *
 * @author Sven <celikovicsven@gmail.com>
 */
public class RPSGameUtil {

    /**
     * Play a desired number of rounds of fixed Rock Paper Scissors game.
     * Player A will always get Paper as his {@link Sign}.
     * Player B will get random {@link Sign}.
     * We are checking {@link Power} that we get after comparing Player A sign with Player B sign.
     * In the first case {@link Power} is STRONG for Player's A sign, so we increase his wins.
     * In the second case {@link Power} is WEAK for Player's A sign, so we increase other player wins.
     * And in the third case {@link Power} is TIE so we increase ties for both players.
     * @param pA Player A
     * @param pB Player B
     * @param rounds desired number of rounds   
     * @param r Random
     */
    public static void playFixGame(Player pA, Player pB, int rounds, Random r) {
        for (int i = 0; i < rounds; i++) {

            pA.setChosenSign(Sign.values()[1]);
            pB.setChosenSign(Sign.values()[r.nextInt(3)]);
            if (pA.getChosenSign().getComperison(pB.getChosenSign()) != null) {
                switch (pA.getChosenSign().getComperison(pB.getChosenSign())) {
                    case STRONG:
                        pA.increaseWins();
                        break;
                    case WEAK:
                        pB.increaseWins();
                        break;
                    case TIE:
                        pA.increaseTies();
                        pB.increaseTies();
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown Sign");
                }
            }
        }
    }
    
    /**
     * Printing out score.
     * @param pA Player A   
     * @param pB Player B
     * @param rounds number of rounds
     */
    public static void printScore(Player pA, Player pB, int rounds) {
        System.out.println(pA.getName() + " wins " + pA.getWins() + " of " + rounds + " games");
        System.out.println(pB.getName() + " wins " + pB.getWins() + " of " + rounds + " games");
        System.out.println("Tie " + (pA.getTies()) + " of " + rounds + " games");
    }

}
