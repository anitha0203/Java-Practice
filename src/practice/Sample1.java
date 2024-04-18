package practice;

public class Sample1 {
	int x = 13;

	// constructor
	public Sample1() {
		    x = 5; 
    }

	public static void main(String[] args) {
		Sample1 myObj1 = new Sample1(); // Object 1
		System.out.println(myObj1.x);

		Fruit myObj2 = new Fruit(); // Object 2
		System.out.println(myObj2.Mango);
	}
}

class Fruit {
	int Mango = 4;
	int Apples = 5;
}