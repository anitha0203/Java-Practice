package practice;

public class Vehicle {
	protected String brand = "BMW";

	public void start() {
		System.out.println("BMW Started!");
	}
}

class Car extends Vehicle {
	private String modelName = "Model1";

	// Getter method for modelName
	public String getModelName() {
		return modelName;
	}
}