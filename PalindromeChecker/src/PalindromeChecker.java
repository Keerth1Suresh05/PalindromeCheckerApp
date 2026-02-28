import java.util.Scanner;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 4.0
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        char[] str = s.toCharArray();
        int n = s.length();
        int left = 0;
        int right = n-1;

        while(left<right){
           for(int i=0;i<=n;i++){
               if(str[left]!=str[right]) {
                   flag = false;
                   break;
               }
           }
           left++;
           right--;
        }

        System.out.print("Is it a Palindrome? : "+flag);
    }
}

