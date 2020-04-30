package Package_Animals;

import java.awt.Point;

public class CAT extends TerrestrialAnimals{
	private boolean Castrated;
	private static String cat_AIS = "Meow"; // AIS = animal-individual-sound
	public CAT(String name, String gender, double weight, double speed,int point_x,int point_y, int noLegs, boolean Castrated) {
		super(name, gender, weight, speed, point_x, point_y, noLegs,get_cat_AIS());
		// TODO Auto-generated constructor stub
		this.Castrated = Castrated;
	}
	public String toString() {
		return (super.toString() + " Castrated?: " + this.get_Castrated() + " \n");
	}
	private boolean get_Castrated() {return this.Castrated;};
	private static String get_cat_AIS() {return cat_AIS;}
	
	
	private void set_Castrated(boolean Castrated) {this.Castrated = Castrated;};

}
