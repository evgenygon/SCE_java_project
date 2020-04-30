package Package_Animals;

import java.awt.Point;

public class Alligator extends WaterAnimal{
	// x = 50 , y = 0
	private String areaOfLiving;
	private static String alligator_AIS = "Roar"; // AIS = animal-individual-sound
	public Alligator(String name, String gender, double weight, double speed,int x ,int y, double diveDept, String areaOfLiving) {
		super(name, gender, weight, speed, x,y, diveDept, get_alligator_AIS());
		// TODO Auto-generated constructor stub
		this.areaOfLiving = areaOfLiving;
		
	}

	
	private static String get_alligator_AIS() {return alligator_AIS;}
	public String toString() {
		return (super.toString() + " areaOfLiving: " + this.get_areaOfLiving() + " \n");
	}
	private String get_areaOfLiving() {return this.areaOfLiving;};
}
