import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class PalindromeChecker {
    /*
     * @author developer
     * @version 8.0
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Input text: ");
        String s = scn.next();
        LinkedList<Character> list = new LinkedList<>();

        char[] str = s.toCharArray();

        for(char c: str){
            list.add(c);
        }

        int n = list.size();

        Iterator<Character> forward = list.iterator();
        Iterator<Character> backward = list.descendingIterator();


        for(int i=0;i<n/2;i++){
            if(!forward.next().equals(backward.next())){
                flag = false;
                break;
            }
        }


        System.out.print("Is it a Palindrome? : ");
        System.out.println(flag);
    }
}

