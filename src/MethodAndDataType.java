public class MethodAndDataType {
    static void intMethod(int a, int b) {
        System.out.println("Sum of a+b= " + (a + b));
    }

    static void doubleMethod(double a, double b) {
        System.out.println("Division of a%b= " + (a % b));
    }

    static void floatMethod(float a, float b) {
        System.out.println("Division of a/b= " + (a / b));
    }

    static void longMethod(long a, long b) {
        System.out.println("Subtract of a-b= " + (a - b));
    }

    static void byteMethod(byte a, byte b) {
        System.out.println("multiplication of a*b= " + (a * b));
    }

    static void shortMethod(short a, short b) {
        System.out.println("Sum of a+b= " + (a + b));
    }

    static void charMethod(char a, char b) {
        //it will show the value based on ASCII table
        System.out.println("Sum of a+b= " + (a + b));
    }

    static void booleanMethod(boolean a) {
        //it default value of boolean is false
        System.out.println(a);
    }


    public static void main(String[] args) {

        intMethod(10, 10);
        doubleMethod(10,5);
        floatMethod(10f,5f);
        longMethod(500L, 100L);
        byte a=10,b=20;
        byteMethod(a,b);
        short a1=10,b1=10;
        shortMethod(a1,b1);
        charMethod('a','b');
        booleanMethod(true);
    }
}
