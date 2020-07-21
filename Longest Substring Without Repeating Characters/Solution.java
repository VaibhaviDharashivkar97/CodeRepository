import java.util.*;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)
            return s.length();
        Set<Character> set = new HashSet<>();
        int j = 0;
        int highest = 0;
        for(int i=0; i<s.length(); i++) {
            if(set.add(s.charAt(i))){
                highest = Math.max(highest, i-j+1);
            }
            else {
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                i--;
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}


/*
for(int i=0; i<s.length(); i++){
        if(hash_Set.add(s.charAt(i)))
        counter++;
        else{
        if(counter>highest) {
        highest = counter;
        i = (i - counter) +1;
        counter = 0;
        hash_Set.clear();
        }
        else {
        i = (i - counter)+1;
        counter = 0;
        hash_Set.clear();
        }
        }
        }
        return highest;*/
