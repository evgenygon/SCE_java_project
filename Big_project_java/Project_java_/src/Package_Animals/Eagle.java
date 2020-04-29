package Package_Animals;

import java.awt.Point;

public class Eagle extends TerrestrialAnimals{
	private double altitudeOfFlight;
	public static final int MAX_ALTITUDE = 1000;
	private static String eagle_AIS = "Clack_wack_chack"; //  AIS = animal-individual-sound
	
	Eagle(String name, String gender, double weight, double speed,int x,int y, int noLegs, double altitudeOfFlight) {
		super(name, gender, weight, speed, x,y, noLegs,get_eagle_AIS());
		this.altitudeOfFlight = altitudeOfFlight;
	}

	private static String get_eagle_AIS() {return eagle_AIS;}
	
	private double get_altitudeOfFlight() {return this.altitudeOfFlight;};
	public String toString() {
		return (super.toString() + " altitudeOfFlight: " + this.get_altitudeOfFlight() + " \n");
	}
}
