import java.util.Scanner;

public class StringOperation {

    public boolean nameEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    public boolean nameEqualsIgnoreCase(String str3, String str4) {
        return str3.equalsIgnoreCase(str4);
    }

    public void stringPreDefinedSplitMethod(String str5) {
//        String sl = str5.toLowerCase();
        String[] s1 = str5.split(" ");
        for (String ss1 : s1) {
            System.out.println(ss1);
        }
        System.out.println("-------------------------------");
        String[] s2 = str5.split(" ", 2);
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
    }

    public void stringPreDefinedTrimMethod(String str5) {
        String s3 = str5.trim();
        System.out.println(s3);
    }

    public void stringPreDefinedStripMethod(String str5){

    }

    public void stringPreDefinedSubStringMethod(String str5){

    }


    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the str1 : ");
//        String str1=scanner.next();
//        System.out.println("Enter the str2 : ");
//        String str2=scanner.next();
//        System.out.println("Enter the str3 : ");
//        String str3=scanner.next();
//        System.out.println("Enter the str4 : ");
//        String str4=scanner.next();
//        System.out.println("Enter the str5 : ");
//        String str5=scanner.nextLine();

        StringOperation stringOperation = new StringOperation();
//        boolean s=stringOperation.nameEquals(str1,str2);
//        System.out.println("Compare using Equals : "+s);
//        System.out.println("Compare using EqualsIgnoreCase : "+stringOperation.nameEqualsIgnoreCase(str3,str4));
//        stringOperation.stringPreDefinedSplitMethod(str5);
        stringOperation.stringPreDefinedSplitMethod("Learning Software Testing Class");
        stringOperation.stringPreDefinedTrimMethod("Software Training");
    }
}
