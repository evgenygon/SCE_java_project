package Package_Animals;

import java.awt.Point;

public class Whale extends WaterAnimal{
	// x = 50 , y = 0

	private String foodtype;
	private static String whale_AIS = "Splash"; //  AIS = animal-individual-sound
	public Whale(String name, String gender, double weight, double speed, int x,int y, double diveDept, String foodtype) {
		super(name, gender, weight, speed, x,y, diveDept,get_whale_AIS());
		// TODO Auto-generated constructor stub
		this.foodtype = foodtype;
		
	}

	public String toString() {
		return (super.toString() + " foodtype: " + this.get_foodtype() + " \n");
	}
	private String get_foodtype() {return this.foodtype;};
	private static String get_whale_AIS() {return whale_AIS;}
	
	
	
}
