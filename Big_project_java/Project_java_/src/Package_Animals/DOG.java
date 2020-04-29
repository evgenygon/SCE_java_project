package Package_Animals;

import java.awt.Point;

public class DOG extends TerrestrialAnimals{

	private String breed;
	private static String dog_AIS = "Woof Woof"; //  AIS = animal-individual-sound
	
	DOG(String name, String gender, double weight, double speed, int x,int y, int noLegs, String breed) {
		super(name, gender, weight, speed, x,y, noLegs,get_dog_AIS());
		this.breed = breed;
		// TODO Auto-generated constructor stub
	}

	private static String get_dog_AIS() {return dog_AIS;}
	
	public String toString() {
		return (super.toString() + " " + this.get_breed() + " \n");
	}
	private String get_breed() {return this.breed;};
	
}
