/*
 * Find the no of prefixes present from an array of strings
 * INPUT = { "aa","aabc" ,"bb", "cc", "ddaa"}, Prefix: "aa"
 * OUTPUT = 2
 * */

package algo.medium.findprefix;

public class FindPrefixString {

    public static void main(String[] args) {
        String[] strArr = {"aa", "aacc", "bb", "cc", "ddaa"};
        String prefix = "zz";
        System.out.println(findNoOfPrefix(strArr, prefix));
    }

    public static int findNoOfPrefix(String[] strArr, String prefix) {
        int noOfPrefixs = 0;
        /*int first = 0;
        int last = strArr.length - 1;
        int index = 0;
        while (index < strArr.length - 1 && first <= last) {
            int m = (first + last) / 2;
            int res = comparePrefix(strArr[m], prefix);
            System.out.println("# First-> " + first + " Last-> " + last + " Middle-> " + m + " Result-> " + res);
            if (res == 0) {
                noOfPrefixs++;
            } else if (res > 0) {
                last = m - 1;
            } else if (res < 0) {
                first = m + 1;
            }
            System.out.println("###First-> " + first + " Last-> " + last + " Middle-> " + m + " Result-> " + res);
            index++;
        }*/
        for(int i = 0; i< strArr.length; i++) {
            if(comparePrefix(strArr[i], prefix) == 0) {
                noOfPrefixs++;
            }
        }

        return noOfPrefixs;
    }

    public static int comparePrefix(String str, String prefix) {
        int check = 0;
        char[] charArr = str.toCharArray();
        char[] prefixArr = prefix.toCharArray();
        for (int i = 0; i < prefixArr.length; i++) {
            if (prefixArr[i] != charArr[i]) {
                check = charArr[i] - prefixArr[i];
            }
        }
        return check;
    }
}
