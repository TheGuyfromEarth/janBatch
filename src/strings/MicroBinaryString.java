package strings;

public class MicroBinaryString {

        public static void BinaryString(int n,String s) {
            // write your code here
            int count = 0;

            for(int i=0;i<n;i++){
                if(s.charAt(i) == '1'){
                    count++;
                }
            }
            System.out.println(count);
        }
}



