package HW1;

/**
 * Class: HW1
 * @author CSSE Faculty
 * Purpose: The primary objective of this assignment is to get working smoothly the
 *          process of checking out homework projects Eclipse and submitting your .java files
 *          correctly to this assignment's Moodle Dropbox
 */
public class HW1 {

    /**
     * This method takes in 4 separate integers. The first two comprise the first
     * fraction as the numerator and denominator, respectively. The third and fourth
     * integers comprise the second fraction.
     *
     * This method returns the decimal result of adding the two fractions
     *
     * Example
     *
     * addFraction(1,2,1,4) returns 0.75
     */
    public static double addFraction(int num1, int den1, int num2, int den2) {


        return (double) ((num1/den1) + (num2/den2));
    }

    /**
     * Takes a string that is all Ts or Fs.
     *
     * T stands for touchdown and is worth 7 points. F stands for fieldgoal and is
     * worth 3 points.
     *
     * Returns the total score.
     *
     * For example: "TT" returns 14 "FTF" returns 13 "FFFF" returns 12 "" returns 0;
     *
     *
     * @param a string only Ts and Fs
     * @return a score
     */
    public static int footballScore(String input) {
        
        int points = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'T') {
                points += 7;

            } 

            else if (input.charAt(i) == 'F') {
                points += 3;
            }
        }
        return points;
    }

}// end class HW1