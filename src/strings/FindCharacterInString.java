package strings;

import java.util.Scanner;

public class FindCharacterInString {
        public static void main (String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String s=new String();
            int N=sc.nextInt();
            String x=sc.next();
            s=sc.next();
            boolean flag = false;
            for(int i=0;i<N;i++)
            {
                if(s.charAt(i)==(x.charAt(0))){
                    System.out.println(s.indexOf(x));
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                System.out.println("-1");
        }
    }
