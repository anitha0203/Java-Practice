package practice;

public class Sample2 extends Vehicle {
	public static void main(String[] args) {
		
//		Encapsulation
		Person myObj = new Person();
		myObj.setName("AnithaB"); // Set the value of the name variable
		System.out.println(myObj.getName());

				

//		Inheritance
        // Create a myCar object
        Car myCar = new Car();

        // Call the start() method (from the Vehicle class) on the myCar object
        myCar.start();
        System.out.println(myCar.brand + " " + myCar.getModelName());

	}
}