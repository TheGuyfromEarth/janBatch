// given two strings, check whether they are anagrams or not.
// Ex: str1 = loin
// str2 = lion
// O/P: true

// Ex: str1 = moon
// str2 = nemo
// O/P: false

package strings;

public class IsAnagram {

    public static void main(String[] args) {

        String str1 = "moon";
        String str2 = "mono";

        int[] str1Count = new int[26];
        int[] str2Count = new int[26];

        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
            return;
        }

        for (int index = 0; index < str1.length(); index++) { // moon
            char ch = str1.charAt(index);
            int chIndex = ch - 'a';
            str1Count[chIndex] = str1Count[chIndex] + 1;
        }

        for (int index = 0; index < str2.length(); index++) {
            char ch = str2.charAt(index);
            int chIndex = ch - 'a';
            str2Count[chIndex] = str2Count[chIndex] + 1;
        }

        boolean isAnagram = true;

        for (int count = 0; count < str1Count.length; count++) {
            if (str1Count[count] != str2Count[count]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not anagram");
    }
}
