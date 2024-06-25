import java.util.Scanner;

public class SumOfNumbers {

    public int sumOfNum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=scanner.nextInt();

        SumOfNumbers sumOfNumbers=new SumOfNumbers();
        System.out.println(sumOfNumbers.sumOfNum(num));
    }
}
