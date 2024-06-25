import java.util.Scanner;

public class NaturalNumbers {

    public static int naturalNum(int n){
        int sum=0 , sqr=0;
        for(int i=1;i<=n;i++){
            sqr=i*i;
            sum+=sqr;
        }
        return sum;
    }

    public static int sqrOfSum(int n){
        int sum=0 , sqr=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum * sum;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        int sumOfSquares = naturalNum(n);
        int squareOfSum = sqrOfSum(n);

        int diff=  squareOfSum - sumOfSquares;
        System.out.println("Difference : "+diff);



    }
}
