package Package_Animals;

import java.awt.Point;

public class Pigeon extends TerrestrialAnimals{
	private String family;
	private static String pigeon_AIS = "Arr-rar-rar-rar-raah"; //  AIS = animal-individual-sound
	
	Pigeon(String name, String gender, double weight, double speed, int x,int y, int noLegs, String family) {
		super(name, gender, weight, speed, x,y, noLegs,get_pigeon_AIS());
		this.family = family;
	}

	private static String get_pigeon_AIS() {return pigeon_AIS;}
	public String toString() {
		return (super.toString() + " family: " + this.get_family() + " \n");
	}
	private String get_family() {return this.family;};
	
}
