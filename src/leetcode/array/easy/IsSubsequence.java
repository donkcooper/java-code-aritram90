package leetcode.array.easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) {
            return true;
        }
        if(t.length() == 0) {
            return false;
        }
        int i = 0;
        int j = 0;
        do {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(ch1 == ch2) {
                i++;
            }
            j++;
        } while(j < t.length() && i < s.length());
        if(i == s.length()) {
            return true;
        }
        return false;
    }
}