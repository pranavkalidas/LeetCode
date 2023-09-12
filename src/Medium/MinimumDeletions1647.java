package Medium;

import java.util.HashSet;
import java.util.Set;

public class MinimumDeletions1647 {
    public static void main(String[] args) {
        String s = "bbcebab";
        System.out.println(minDeletions(s));
    }

    public static int minDeletions(String s) {
        int deletions = 0;
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        Set<Integer> uniqueCount = new HashSet<>();
        for (int freq : arr) {
            while (freq != 0 && !uniqueCount.add(freq)) {
                deletions++;
                freq--;
            }
        }
        return deletions;
    }
}
