package Package_Animals;

import java.awt.Point;

enum Poisnous 
{
	l1,l2,l3
}

public class SNAKE extends TerrestrialAnimals{

	private Poisnous Poisnous;
	private double lentgh;
	private static String snake_AIS = "ssssssss"; // AIS = animal-individual-sound
	SNAKE(String name, String gender, double weight, double speed, int x,int y, int noLegs, Poisnous Poisnous, double lentgh) {
		super(name, gender, weight, speed, x,y, noLegs,get_snake_AIS());
		// TODO Auto-generated constructor stub
		this.Poisnous = Poisnous;
		this.lentgh = lentgh;
	}
	private static String get_snake_AIS() {return snake_AIS;};

	public String toString() {
		return (super.toString() + " Poisnous: " + this.get_Poisnous() + " lentgh: " + this.get_lentgh() + " \n");
	}
	private Poisnous get_Poisnous() {return this.Poisnous;};
	private double get_lentgh() {return this.lentgh;};
}
