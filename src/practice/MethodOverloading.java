package practice;

class MathOperation {

    // Method with one parameter
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method with the same name but two parameters
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method with the same name but different types of parameters
    public double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperation op = new MathOperation();

        System.out.println(op.multiply(4, 5));       // Calls the first method
        System.out.println(op.multiply(4, 5, 6));    // Calls the second method
        System.out.println(op.multiply(4.5, 5.5));   // Calls the third method
    }
}