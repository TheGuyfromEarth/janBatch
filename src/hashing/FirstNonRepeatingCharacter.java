package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        String str = input.next();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (frequencyMap.containsKey(ch)) {
                int curFreq = frequencyMap.get(ch);
                frequencyMap.put(ch, curFreq + 1);
            } else {
                frequencyMap.put(ch, 1);
            }

//            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int freq = frequencyMap.get(ch);
            if (freq == 1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
