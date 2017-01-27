package Abstract;

public class AbstractMain {

	public static void main(String[] args) {

		AbstractCar aCar = new Car(); // indirect object creation

		aCar.acclerate(); // It means you can create an object of abstract
							// derived class

		aCar.run();

		aCar.i = 10;

		aCar.speed();

	}
}