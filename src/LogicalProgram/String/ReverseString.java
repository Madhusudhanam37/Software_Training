package LogicalProgram.String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    public void reverseStringMethod1(String s){
        String temp="";
        for(int i=s.length()-1;i>=0;i--){
            temp+=s.charAt(i);
        }
        System.out.println(temp);
    }

    public void reverseStringMethod2(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        String reversStrings=stringBuilder.reverse().toString();
        System.out.println("Reverse a String Second Method : "+reversStrings);
    }

    public void reverseStringInSamepalce(String s){
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            words[i]=new StringBuilder(words[i]).reverse().toString();
        }
        String reversedString=String.join(" ",words);
        System.out.println("Reverse String In Same palce : "+ reversedString);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=scanner.nextLine();

        ReverseString reverseString=new ReverseString();
        reverseString.reverseStringMethod1(s);
        reverseString.reverseStringMethod2(s);
        reverseString.reverseStringInSamepalce(s);
    }
}
