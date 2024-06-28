package LogicalProgram.String;

import java.util.Scanner;

public class PrintnPrimeNumber {

    public static void printNPrimeNumber(int number){
        boolean flag=true;
        if(number<=1){
            flag=false;
        }
        for(int i=0;i<=number/2;i++){
            if(number%2==0){
                flag=false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=scanner.nextInt();

    }
}
