import java.util.Scanner;

public class Vowels {

    public int vowel(String name){
        String names=name.toLowerCase();
        int count=0;
        for(char cc:names.toCharArray()){
            if(cc == 'a' || cc=='e' || cc=='i' || cc=='o' || cc== 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre the string");
        String name=scanner.nextLine();

        Vowels vowels=new Vowels();
        System.out.println("Number of Vowels in String : "+vowels.vowel(name));
    }
}
