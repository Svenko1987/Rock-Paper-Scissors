
/**
 * 
 * @author Sven <celikovicsven@gmail.com>
 */
public enum Sign {
    ROCK(Power.TIE, Power.WEAK, Power.STRONG), PAPER(Power.STRONG, Power.TIE, Power.WEAK), SCISORS(Power.WEAK, Power.STRONG, Power.TIE);

    private final Power vsRock;
    private final Power vsPaper;
    private final Power vsScisors;
/**
 * 
 * @param vsR {@link Power} against Rock
 * @param vsP {@link Power} against Paper
 * @param vsS {@link Power} against Scissors
 */
    private Sign(Power vsR, Power vsP, Power vsS) {
        vsRock = vsR;
        vsPaper = vsP;
        vsScisors = vsS;
    }

    private Power getVsRock() {
        return vsRock;
    }

    private Power getVsScisors() {
        return vsScisors;
    }

    private Power getVsPaper() {
        return vsPaper;
    }
    
    /**
     * 
     * @return {@link Power} of this {@link Sign} depending on the
     * @param chosen by the other {@link Player}
     */
    public Power getComperison(Sign chosen) {
        Power comp;
        {
            if (null == chosen) {
                comp = getVsScisors();
            } else {
                switch (chosen) {
                    case ROCK:
                        comp = getVsRock();
                        break;
                    case PAPER:
                        comp = getVsPaper();
                        break;
                    default:
                        comp = getVsScisors();
                        break;
                }
            }
        }
        return comp;
    }

}
