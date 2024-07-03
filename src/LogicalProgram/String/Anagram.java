package LogicalProgram.String;

import java.util.Arrays;

public class Anagram {

    public boolean anagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char[] s1CharArray=s1.toCharArray();
        char[] s2CharArray=s2.toCharArray();

        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);

       boolean result=Arrays.equals(s1CharArray,s2CharArray);

       return result;
    }

    public static void main(String[] args) {
        String s1="listen";
        String s2="netsil";

        Anagram anagrams=new Anagram();

        if(anagrams.anagram(s1,s2)){
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }

    }
}
