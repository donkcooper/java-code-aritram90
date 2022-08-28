package algo.util;

public class StringArrayToNumberArray {
    public static int[] stringArrayToIntegerArray(String [] array) {
        int[] num = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            num[i] = Integer.parseInt(array[i]);
        }
        return num;
    }
}