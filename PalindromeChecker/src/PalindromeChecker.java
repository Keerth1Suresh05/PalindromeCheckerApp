import java.util.Scanner;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 1.0
     */
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        int n = s.length();
        for(int i=0; i<=n/2 ;i++){
            /*
              checks 0 and (n-1)th char (since indexed 0)
              so on... until middle of string
             */
            if(s.charAt(i)!=s.charAt(n-1-i)){
                //if condition false flag down
            flag = false;
            break;
            }
        }
        System.out.print("Is it a Palindrome? : "+flag);

    }
}
