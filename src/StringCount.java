import java.util.Scanner;

public class StringCount {

    public int countWords(String words){
        if(words == null || words.isEmpty()){
            return 0;
        }

        String[] word=words.split(" ");
        return word.length;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String words=scanner.nextLine();

        StringCount stringCount=new StringCount();
        System.out.println("Number of Words is : "+stringCount.countWords(words));
    }
}
