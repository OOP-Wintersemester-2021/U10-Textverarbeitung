package scrabble;

import java.util.HashMap;

public class ScoreChecker {

    private static final String ONE_POINT_CHARS = "AEILNORSTU";
    private static final String TWO_POINT_CHARS = "DG";
    private static final String THREE_POINT_CHARS = "BCMP";
    private static final String FOUR_POINT_CHARS = "FHVWY";
    private static final String FIVE_POINT_CHARS = "K";
    private static final String EIGHT_POINT_CHARS = "JX";
    private static final String TEN_POINT_CHARS = "QZ";

    private static final HashMap<String, Integer> points = new HashMap<String, Integer>() {
        {
            put(ONE_POINT_CHARS, 1);
            put(TWO_POINT_CHARS, 2);
            put(THREE_POINT_CHARS, 3);
            put(FOUR_POINT_CHARS, 4);
            put(FIVE_POINT_CHARS, 5);
            put(EIGHT_POINT_CHARS, 8);
            put(TEN_POINT_CHARS, 10);
        }
    };

    public static int getScore(String str) {
        int score = 0;

        for (int i = 0; i < str.length(); i++) {
            score += getScore(str.charAt(i));
        }
        return score;
    }

    private static int getScore(char c) {
        for(String key: points.keySet()) {
            if(key.indexOf(c) != -1) {
                return points.get(key);
            }
        }

        return 0;
    }
}
