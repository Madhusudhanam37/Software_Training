package projecteuler;

import java.util.stream.IntStream;

public class Problems_1_to_10 {

    public void naturalNumber1(int startnum,int num){

        int sum= IntStream.range(startnum,num).filter(i->i%3==0||i%5==0).sum();
        System.out.println("1st Method of Natural number : "+sum);
    }


    public void naturalNumbers2(int num){
        int sum=0;
            for (int i = 1; i < num; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum = sum + i;
                }
            }
        System.out.println("2nd Method of Natural number : "+sum);
    }

    public void fibonacciSequence1(int num){
        int sum = 0,a = 1,b = 2;
        for (int i = 0; b <= num; i = a + b) {
            if (b % 2 == 0) {
                sum += b;
            }
            a = b;
            b = i;
        }
        System.out.println("Total Sum is : " + sum);//output:
    }

    public void fibonacciSequence2(int num){
        int sum = 0,a = 1,b = 2;
        while (b <= num) {
            if (b % 2 == 0) {
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("2nd Total Sum is : " + sum);//output:4613732
    }


}

