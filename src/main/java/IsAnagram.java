import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println("Is anagram: " + isAnagram("abc", "bca"));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1 == null || s2 == null) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        Arrays.equals(c1, c2);
        return true;
    }
}
