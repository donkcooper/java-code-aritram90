package leetcode.array.easy;

/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.

Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false

Input: s = "paper", t = "title"
Output: true
 */

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Boolean> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            //getting the characters
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map1.containsKey(ch1)) { //whether ch1 is eligible for mapping or not
                if(!(map1.get(ch1).equals(ch2))) {//whether ch1 is mapped to ch2 or not
                    return false;
                }
            } else {//ch1 is eligible for mapping, but we check eligibility for ch2
                if (map2.containsKey(ch2)) {//whether ch2 is eligible for mapping or not
                    return false;
                } else {
                    map1.put(ch1, ch2);
                    map2.put(ch2, true);
                }
            }
        }
        return true;
    }
}