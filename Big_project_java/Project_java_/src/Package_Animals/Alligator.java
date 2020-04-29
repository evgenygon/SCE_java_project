package Package_Animals;

import java.awt.Point;

public class Alligator extends WaterAnimal{
	
	private String areaOfLiving;
	private static String alligator_AIS = "Roar"; // AIS = animal-individual-sound
	Alligator(String name, String gender, double weight, double speed,int x ,int y, double diveDept, String areaOfLiving) {
		super(name, gender, weight, speed, x,y, diveDept, get_alligator_AIS());
		// TODO Auto-generated constructor stub
		this.areaOfLiving = areaOfLiving;
		
	}

	
	private static String get_alligator_AIS() {return alligator_AIS;}
	
}
