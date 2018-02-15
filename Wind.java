/**
 * Created by CM on 15/02/2018.
 */
public class Wind {
    public enum Warning {NONE, YELLOW, ORANGE, RED, BLACK};

    /**
     * returns the wind warning
     * @param windSpeed
     * @return 
     */
    public static Warning getWarning(int windSpeed) {
        if (windSpeed < 0 || windSpeed > 500) throw new IllegalArgumentException();
        if (windSpeed < 60) return Warning.NONE;
        if (windSpeed < 80) return Warning.YELLOW;
        if (windSpeed < 10) return Warning.ORANGE;
        if (windSpeed <= 120) return Warning.RED;
        return Warning.BLACK;
    }
}
