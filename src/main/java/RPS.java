
import java.util.Random;

public class RPS {

    public static void main(String[] args) {
        
        /**
         * Initializing two new players, Random and number of rounds
         */
        Player pA = new Player("Player A", 0, 0);
        Player pB = new Player("Player B", 0, 0);

        Random R = new Random();
        int rounds = 100;
        
        /**
         * Playing game for created players and wanted number of rounds
         * Print end score
         */
        RPSGameUtil.playFixGame(pA, pB, rounds, R);
        RPSGameUtil.printScore(pA, pB, rounds);
    }
}
