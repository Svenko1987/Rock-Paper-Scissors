
/**
 * @author Sven <celikovicsven@gmail.com>
 */
public class Player {

    private final String name;
    private int wins;
    private int ties;
    private Sign chosenSign;

    /**
     * Create new {@link Player} object with provided name, wins and ties
     * @param Name name
     * @param Wins wins
     * @param Ties ties of this {@link Player}
     *
     */
    public Player(String Name, Integer Wins, Integer Ties) {
        this.name = Name;
        this.wins = Wins;
        this.ties = Ties;
    }

    /**
     * @return name of this {@link Player}
     */
    public String getName() {
        return name;
    }
    
    /**
     * Adding {@link Sign} to this {@link Player}
     * @param ChosenSign 
     */
    public void setChosenSign(Sign ChosenSign) {
        this.chosenSign = ChosenSign;
    }

    /**
     * @return chosen sign of this {@link Player}
     */
    public Sign getChosenSign() {
        return chosenSign;
    }

    /**
     * @return number of wins of this {@link Player}
     */
    public Integer getWins() {
        return wins;
    }

    /**
     * @return number of ties of this {@link Player}
     */
    public int getTies() {
        return ties;
    }

    /**
     * increment number of wins of this {@link Player}
     */
    public void increaseWins() {
        this.wins++;
    }

    /**
     * increment number of ties of this {@link Player}
     */
    public void increaseTies() {
        this.ties++;
    }

}
