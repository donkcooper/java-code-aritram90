package concepts.streams;

import java.util.stream.IntStream;

public class SumOfRangeNumber {

    public static void main(String[] args) {
        System.out.println(getNumbersUsingIntStreamRange(0, 3));
    }

    public static int getNumbersUsingIntStreamRange(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .reduce(0, Integer::sum);
    }
}