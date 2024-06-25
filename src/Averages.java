import java.util.Scanner;

public class Averages {

    public int avg(int a,int b,int c){

        int sum=a+b+c;

        return sum/3;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a=scanner.nextInt();
        System.out.println("Enter the value of B: ");
        int b=scanner.nextInt();
        System.out.println("Enter the value of C: ");
        int c=scanner.nextInt();

        Averages averages=new Averages();
        System.out.println("Average of a,b,c is : "+averages.avg(a,b,c));
    }
}
