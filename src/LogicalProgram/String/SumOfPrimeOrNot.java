package LogicalProgram.String;

public class SumOfPrimeOrNot {
    public static void main(String[] args) {
        int num=31;
        int count=0,lastDigit=0,sum=0;
        while(num!=0){
            lastDigit=num%10;
            sum+=lastDigit;
            num=num/10;
        }
        for(int i=1;i<=sum;i++){
            if(sum% i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is Prime Number");
        }else{
            System.out.println("Not prime number");
        }
    }
}
