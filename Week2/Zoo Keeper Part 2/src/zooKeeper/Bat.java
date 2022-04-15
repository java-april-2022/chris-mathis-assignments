package zooKeeper;

public class Bat extends Mammal{

	public Bat(int energy) {
		super(energy);
	}
	
	public void fly() {
		if(energy < 50) {
			System.out.println("I need to suck some blood");
		}
		else {
			System.out.println("Flap Flap Flap");
			energy -= 50;
		}
	}
	public void eatHumans() {
		if(energy > 275) {
			System.out.println("I'm about to pop");
		}
		else {
			System.out.println("MMM....you've been taking your vitamins");
			energy += 25;
		}
	}
	public void attackTown() {
		if(energy < 100) {
			System.out.println("I got nothing left");
		}
		else {
			System.out.println("Burn baby, Burn");
			energy -= 50;
		}
	}
}
