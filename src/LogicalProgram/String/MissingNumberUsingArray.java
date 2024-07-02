package LogicalProgram.String;

import java.util.Scanner;

public class MissingNumberUsingArray {

    public void missingNum(int[] arrays){
//        int[] a={1,2,4,5};
        int n=arrays.length+1;
        int totalSum=(n*(n+1)/2);
        int arraySum=0;
        for(int num:arrays){
            arraySum+=num;
        }
        int missingNumber=totalSum - arraySum;
        System.out.println("Missing Number Is : "+missingNumber);
    }

    public void missNumbers(){
        int[] arrayss={16,17,19,20};
        int n=arrayss.length+1;
        int start=16;
        int end=start+n-1;
        int totalSum=(end*(end+1)/2)-((start-1)*start/2);
        int arraySum=0;
        for(int num:arrayss){
            arraySum+=num;
        }
        int missingNumber=totalSum - arraySum;
        System.out.println("Missing Number Of Second Method Is : "+missingNumber);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int size=scanner.nextInt();
        int[] arrays=new int[size];
        System.out.println("Enter the Array");
        for(int i=0;i<size;i++){
            arrays[i]=scanner.nextInt();
        }

        MissingNumberUsingArray array=new MissingNumberUsingArray();
        array.missingNum(arrays);
        array.missNumbers();
    }
}
