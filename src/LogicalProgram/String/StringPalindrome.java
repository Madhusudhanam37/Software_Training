package LogicalProgram.String;

import java.util.Scanner;

public class StringPalindrome {

    public static void stringPalindrome(String word) {
        String temp="";
        for(int i=word.length()-1;i>=0;i--){
            temp=temp+word.charAt(i);
        }
        if(word.equals(temp)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Word");
        String word=scanner.nextLine();

        stringPalindrome(word);
    }
}
