package LogicalProgram.String;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void isPrime2(int number){
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is 2nd Method prime Number");
        }else{
            System.out.println("It is 2nd Method Not prime number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=scanner.nextInt();

//        if(isPrime(number)){
//            System.out.println("Give Number is Prime");
//        }else{
//            System.out.println("given number is Not prime");
//        }

        isPrime2(number);
    }
}
