package src.Arrays;

public class ValidAnagram {
    // 1st method ----> using Arrays
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for(int i=0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
            if(freq[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    // 2nd method -------> using Arrays and Sorting 
    // Covered in Sorting folder

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(s);
        System.out.println(t);

        System.out.println(isAnagram(s, t));
    }
}
