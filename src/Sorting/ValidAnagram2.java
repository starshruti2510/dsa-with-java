package src.Sorting;

import java.util.Arrays;

public class ValidAnagram2 {
    // 1st method is Covered in Arrays Folder

    // This is 2nd method ------> using Arrays and Sorting
    public static boolean isAnagram2(String s, String t) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }
        for(int i=0;i<26;i++){
         if(freq[i]!=0){
            return false;//ellam 0 aagirkanum.
         }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(s);
        System.out.println(t);

        System.out.println(isAnagram2(s, t));
    }
}
