package strings;

public class BinaryString {
    public static int binarySubstring(int a, String str) {
        int count = 0;
        String s;
        int numOnes = 0;

        for (int i = 0; i < a; i++) {
            char ch = str.charAt(i);
            if (ch == '1')
                numOnes++;
        }

        count = (numOnes * (numOnes - 1)) / 2;

        return count;
    }
}