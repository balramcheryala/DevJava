package Abstract;

public class Car extends AbstractCar {

	@Override
	void acclerate() {

		System.out.println("Car Accelarated ");
	}

	public Car() {
		System.out.println("Car Constructor class invoked");
	}

}
