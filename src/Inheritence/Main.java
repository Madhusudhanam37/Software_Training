package Inheritence;

public class Main {
    public static void main(String[] args) {
        Adder adder=new Adder();
         System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        System.out.println(adder.add(10, 32));
        System.out.println(adder.add(42, 1));
        System.out.println(adder.add(13, 7));
    }
}
