package programs.Basics;

public class Hero extends ActionCharacter implements Flight, Car {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.inFlight();
		h.inCar();
	}

	@Override
	public void inFlight() {
		System.out.println("in Flight in Hero");
	}

}
