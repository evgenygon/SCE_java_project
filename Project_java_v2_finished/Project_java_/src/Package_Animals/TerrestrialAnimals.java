package Package_Animals;

import java.awt.Point;

public class TerrestrialAnimals extends Animal{
	// x = 0, y = 20
	private int noLegs;
	private String TerrestrialAnimals_Sound;
	
	TerrestrialAnimals(String name, String gender, double weight, double speed,int point_x,int point_y, int noLegs, String AIS) {
		super(name, gender, weight, speed, point_x,point_y);
		// TODO Auto-generated constructor stub
		this.noLegs = noLegs;
		this.TerrestrialAnimals_Sound = AIS;
	}

	@Override
	public boolean speedUP(int makeSpeedUP_or_Down) {
		if (makeSpeedUP_or_Down <= MAX_SPEED && makeSpeedUP_or_Down >= 0) 
		{
			set_spcific_Animal_speed(makeSpeedUP_or_Down);
			return true;
		}
		
		// no more then
		// static final int MAX_SPEED = 5;
		// for more info look at interface "IReptile"
		return false;
	}

	@Override
	public Point getLocation() {
		return getLocation();
	}

	@Override
	public boolean setLocation(Point p) {
		return setLocation(p);
	}

	@Override
	public void makeSound() {
		System.out.print("Animal " + this.get_animal_name() + " said " + this.TerrestrialAnimals_Sound + "\n");

	}

	protected String get_TerrestrialAnimals_Sound() {return this.TerrestrialAnimals_Sound;};
	protected int get_noLegs() {return this.noLegs;};

	
	public String toString() {
		System.out.print("toString TerrestrialAnimals\n");
		return (super.toString() + " N_legs: " + this.get_noLegs());
	
	}
	
}
