package practice;

public class Sample {

	static void myMethod(String fname) { // Parameters
		System.out.println("My name is " + fname);
	}

	static int plusMethod(int x, int y) {
		return x + y;
	}

	static double plusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {

// 		Primitive Data Types

		// Byte primitive data type (whole numbers from -128 to 127)
		byte myNum = 100;
		System.out.println(myNum);

		// short primitive data type (whole numbers from -32768 to 32767)
		int myNumShort = 15;
		System.out.println(myNumShort);

		// int primitive data type (whole numbers from -2147483648 to 2147483647)
		int myNumInt = 15;
		System.out.println(myNumInt);

		// long primitive data type (whole numbers from -9223372036854775808 to
		// 9223372036854775807)
		long myNumLong = 15;
		System.out.println(myNumLong);

		// float primitive data type (decimals, such as 19.99 or -19.99)
		float myFloatNum = 5.99f;
		System.out.println(myFloatNum);

		// char primitive data type (single characters, such as 'a' or 'B')
		char myLetter = 'D';
		System.out.println(myLetter);

		// boolean primitive data type (true or false)
		boolean myBool = true;
		System.out.println(myBool);

//		Non-Primitive Data Types

		// Stirng non-primitive data type
		String greeting = "Hello";
		System.out.println(greeting);
		System.out.println("The length of the txt string is: " + greeting.length());

		// Arrays non-primitive data type
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars[0]);

		
//		Methods
		myMethod("Anitha"); // Arguments

		
//		Method Overloading
		int myNum1 = plusMethod(8, 5);
		System.out.println(myNum1);
		
		double myNum2 = plusMethod(4.3, 6.26);
		System.out.println(myNum2);
	}
}
