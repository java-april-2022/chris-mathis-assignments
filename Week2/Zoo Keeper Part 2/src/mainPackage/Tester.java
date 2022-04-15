package mainPackage;
import zooKeeper.Bat;
import zooKeeper.Gorilla;
import zooKeeper.Mammal;

public class Tester {
	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla(100);
		
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		gorilla.climb();
		
		gorilla.displayEnergy();
		
		gorilla.eatBananas();
		
		gorilla.displayEnergy();
		
		
		Bat bat = new Bat(300);
		
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		
		bat.eatHumans();
		bat.eatHumans();
		
		bat.fly();
		bat.fly();
		
		bat.displayEnergy();
	
	}

}
