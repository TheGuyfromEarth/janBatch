// Given a string, isolate consonants, vowels and special characters (excluding spaces).
// Ex: str = happy morning :)
// O/P: vowels = {a,o,i}
// consonants = {h,p,p,y,m,r,n,n,g}
// sp chars = {:,)}

package strings;

import java.util.ArrayList;
import java.util.List;

public class IsolateLetters {

    public static void main(String[] args) {
        String str = "happy morning :)";
        List<Character> vowel = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();
        List<Character> spChars = new ArrayList<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == 'a'|| ch=='e'||ch == 'i'|| ch=='o'|| ch=='u')
                vowel.add(ch);
            else if((ch>65 && ch<=90) || (ch>97 && ch<=122))
                consonants.add(ch);
            else if(ch ==' ')
                continue;
            else
                spChars.add(ch);
        }
        System.out.println(vowel);
        System.out.println(consonants);
        System.out.println(spChars);
    }
}
