package Package_Animals;

import java.awt.Point;

enum WaterType 
{
	Sea, Sweet
}

public class Dolphin extends WaterAnimal{

	private WaterType watertype1;
	private static String dolphin_AIS = "Click-click"; //  AIS = animal-individual-sound

	public Dolphin(String name, String gender, double weight, double speed, int x,int y, double diveDept, String watertype) {
		super(name, gender, weight, speed, x,y, diveDept,get_dolphin_AIS());
		this.watertype1 = WaterType.valueOf(watertype);
	}

	private static String get_dolphin_AIS() {return dolphin_AIS;}
	
	public String toString() {
		return (super.toString() + " WaterType:" + this.get_WaterType() + " \n");
	}
	private WaterType get_WaterType() {return this.watertype1;};
	
	
}
