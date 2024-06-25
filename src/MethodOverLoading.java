public class MethodOverLoading {

    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public double add(int a,int b,double c){
        double sum=a+b+c;
        return sum;
    }
    public long add(int a,int b,long c,int d){
        long sum=a+b+c+d;
        return sum;
    }


    public static void main(String[] args) {
        MethodOverLoading method=new MethodOverLoading();
        System.out.println(method.add(10,20));
        System.out.println(method.add(10,20,25.5));
        System.out.println(method.add(10, 20, 30l, 40));
    }
}
