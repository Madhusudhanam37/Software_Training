package LogicalProgram.String;

import java.util.Scanner;

public class FibonacciSequence {

    public static void findFibonacciSequence(int num) {
        int sum = 0,n1=0,n2=1;
        for (int i = 1; i <= num; i++) {
            System.out.print(n1+" ");
            sum = n1 + n2;
            n1=n2;
            n2=sum;
        }
    }

    public static void findFSUsingWhile(int num){
        int sum=0,n1=0,n2=1,i=1;
        while (i<=num){
            System.out.print(n1+" ");
            sum=n1+n2;
            n1=n2;
            n2=sum;
            i++;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();

//        findFibonacciSequence(num);
        findFSUsingWhile(num);

    }
}
