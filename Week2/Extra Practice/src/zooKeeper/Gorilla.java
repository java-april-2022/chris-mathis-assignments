package zooKeeper;

public class Gorilla extends Mammal {

	public Gorilla(int energy) {
		super(energy);
	}

	public void throwSomething() {
		if (energy < 5) {
			System.out.println("I need bananas");
		} else {
			System.out.println("Take that!");
			energy -= 5;
		}
//		check health..if < 5 print I need bananas.
//		if >5 -5 to health and print Take that!
	}

	public void eatBananas() {
		if (energy > 90) {
			System.out.println("I've had enough");
		} else {
			System.out.println("Tastes so good");
			energy += 10;
		}
//		check health..if >= 90 print I've had enough.
//		if <90 +10 to health and print So tasty!
	}

	public void climb() {
		if (energy < 10) {
			System.out.println("Feed me first");
		} else {
			System.out.println("I'm so high!");
			energy -= 10;
		}
//		check health..if < 10 print Feed me first.
//		if > 10 -10 to health and print I'm so high.
	}
}
