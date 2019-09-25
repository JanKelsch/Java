import java.util.ArrayList;

public class QuantityDuplicateLetters {



    public static String duplicateLetters(String s) {
        char c;
        ArrayList<String> count = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            if (!count.contains(s.charAt(i) + "")) {
                count.add(s.charAt(i) + "");
            }
        }
        int[] str = new int[count.size()];
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            for (int j = 0; j < count.size(); j++) {
                if (count.get(j).equals(c + "")) {
                    str[j]++;
                }
            }
        }
        String res = "";
        for (int i = 0; i < count.size(); i++) {
            res += count.get(i) + str[i];
        }
        return res;
    }
}

