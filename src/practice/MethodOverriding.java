package practice;

class Vehicles {
	// Method in the superclass
	void move() {
		System.out.println("Vehicle is moving");
	}
}

class Bus extends Vehicles {
	// Overriding method in the subclass
	@Override
	void move() {
		System.out.println("Car is driving");
	}
}

class Bicycle extends Vehicles {
	// Overriding method in the subclass
	@Override
	void move() {
		System.out.println("Bicycle is cycling");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Vehicles myVehicle = new Vehicles(); // Create a Vehicle object
		Vehicles myCar = new Bus(); // Create a Car object
		Vehicles myBicycle = new Bicycle(); // Create a Bicycle object

		myVehicle.move(); // Output: Vehicle is moving
		myCar.move(); // Output: Car is driving
		myBicycle.move(); // Output: Bicycle is cycling

	}
}