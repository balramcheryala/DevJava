package Abstract;

abstract class AbstractCar {

	int i;

	public AbstractCar() {
		System.out.println("Abstract class constructor invoked");
	}

	abstract void acclerate();

	void run() {
		System.out.println("Running");
	}

	void speed() {
		System.out.println("Speed Is : " + i);
	}
}