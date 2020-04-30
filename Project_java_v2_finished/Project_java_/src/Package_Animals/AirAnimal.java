package Package_Animals;

import java.awt.Point;

public class AirAnimal extends Animal{ 
	// x = 0 , y = 100

	private double wingspan;
	private String AirAnimal_Sound;
	AirAnimal(String name, String gender, double weight, double speed, int x,int y, double wingspan, String AIS) {
		super(name, gender, weight, speed, x,y);
		this.wingspan = wingspan;
		this.AirAnimal_Sound = AIS;
		// TODO Auto-generated constructor stub
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
		System.out.print("Animal " + this.get_animal_name() + " said " + this.AirAnimal_Sound);
	}
	private double get_wingspan() {return this.wingspan;};
	public String toString() {
		System.out.print("toString AirAnimals\n");
		return (super.toString() + " wingspan:" + get_wingspan());
		
	}


}
