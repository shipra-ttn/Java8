public class Second {
    static void display(int a,int b) {

        int multiplication = a * b;
        System.out.println("Static method returns multiplication:" + multiplication);
    }

    void display2(int a,int b) {
        int sum = a + b;
        int subtract = a - b;
        System.out.println("Instance add method returns sum:" + sum + " and returns subtraction:" + subtract);

    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        MethodReferenceInterface methodreferenceinterface = Second::display;
        methodreferenceinterface.print(50,30);

        Second methodreference = new Second();
        MethodReferenceInterface methodreferenceinterface1 = methodreference::display2;
        methodreferenceinterface1.print(20,30);
    }
}

interface MethodReferenceInterface {
    void print(int a,int b);
}

