package concepts.streams;

/* Find the unique single digit integer from streams of numbers
INPUT - [ 12 1 1 2 7 7 5 5]
OUTPUT - 2
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        List<String> numbers = Arrays.asList(sc.nextLine().split(" "));
        Set<String> setOfNumbers = new HashSet<>(numbers);
        /*System.out.println(numbers);
        System.out.println(setOfNumbers);
        System.out.println(setOfNumbers.stream()
                .collect(Collectors.toMap(Function.identity(), x -> countIntegersInList(numbers, x))));*/
        Map<String, Integer> mapOfIntegerWithFreq = setOfNumbers.stream()
                .collect(Collectors.toMap(Function.identity(), x -> countIntegersInList(numbers, x)));
        for(String key : mapOfIntegerWithFreq.keySet()) {
            if(Integer.parseInt(key) < 10 && mapOfIntegerWithFreq.get(key) == 1) {
                System.out.println(key);
            }
        }
    }

    public static int countIntegersInList(List<String> numbers, String numberToCount) {
        int count = 0;
        for(String number : numbers) {
            if (number.equals(numberToCount)) count++;
        }
        return count;
    }
}
