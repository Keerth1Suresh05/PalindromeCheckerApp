import java.util.Scanner;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 8.0
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();

        //char[] str = s.toCharArray();

        System.out.print("Is it a Palindrome? : ");
        System.out.println(check(s,0,s.length()-1));
        //System.out.println(flag);
    }

    public static boolean check(String s,int left,int right){
        if(left>=right)return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
        return check(s,left+1,right-1);
    }

}


