import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t){
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        return (sCharArray.equals(tCharArray));
    }
}
