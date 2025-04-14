/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder6 {
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     * from data.
     */
    public static double[] prefixAverage(double[] data) {
        double[] result = new double[data.length];
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            result[i] = sum / (i + 1);
        }
        return result;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     *
     * @param searchValue value to look for in the array
     * @param anArray     array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int indexOf(int searchValue, int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     *
     * @param s       a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int indexOf(String s, String[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     *
     * @param s       string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray) {
        int count = 0;
        for (String string : anArray) {
            if (!string.equals(s)) {
                count++;
            }
        }
        String[] newArray = new String[count];
        int index = 0;

        for (String string : anArray) {
            if (!string.equals(s)) {
                newArray[index] = string;
                index++;
            }
        }
        return newArray;
    }

    /**
     * Reverses an array of integers.
     *
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray) {
        int side1 = 0;
        int side2 = 0;

        while (side1 < side2) {
            int temp = anArray[side1];
            anArray[side1] = anArray[side2];
            anArray[side2] = temp;

            side1++;
            side2--;
        }
    }
}
