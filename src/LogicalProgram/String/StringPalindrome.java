package LogicalProgram.String;

import java.util.Scanner;

public class StringPalindrome {

    public static void stringPalindrome(String word){
        String word1=word;
        String s=" ";
        String ss;
        char[] c=word.toCharArray();
        for(int i=0;i<c.length;i++){
            ss=s+c[i];
        }
//        System.out.println(ss);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Word");
        String word=scanner.nextLine();

        stringPalindrome(word);
    }
}
