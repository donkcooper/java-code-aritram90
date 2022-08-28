package leetcode;

import algo.util.StringArrayToNumberArray;
import leetcode.array.easy.IsSubsequence;
import leetcode.array.easy.TwoSum;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunCode {
    public static void main(String args[]) {
        String s = "axc";
        String t = "ahbgdc";
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence(s, t));
    }

    private static long cardRange(long start, long end) {
        LocalDateTime startTime = LocalDateTime.now();
        for(long i = start; i <= end; i++ ) {
            System.out.println("Card Number: " + i);
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Endtime: " + endTime + " Starttime: " + startTime);
        long timeTaken = Duration.between(startTime, endTime).toMillis();
        return timeTaken;
    }

    private static List<Long> matchCardList(List<Long> cardList, long start, long end) {
        List<Long> matchedCard = new ArrayList<>();
        LocalDateTime startTime = LocalDateTime.now();
        for(long i = start; i <= end; i++ ) {
            if(cardList.contains(i)) {
                matchedCard.add(i);
            }
        }
        LocalDateTime endTime = LocalDateTime.now();
        long timeTaken = Duration.between(startTime, endTime).toMillis();
        System.out.println("Time Taken: " + timeTaken);
        return matchedCard;
    }
}