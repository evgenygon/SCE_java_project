package Package_Animals;

import java.awt.Point;

public class WaterAnimal extends Animal{
	
	// x = 50 , y = 0
	public static final int MAX_DIVE = -800;
	private double diveDept;
	private String WaterAnimal_Sound;
	WaterAnimal(String name, String gender, double weight, double speed,int x,int y, double diveDept, String AIS) {
		super(name, gender, weight, speed, x,y);
		this.diveDept = diveDept;
		this.WaterAnimal_Sound = AIS;
		// TODO Auto-generated constructor stub
	}
	protected void Dive(double change_diveDept){
		if (change_diveDept > MAX_DIVE && change_diveDept < 0)
		{
			this.diveDept = change_diveDept;
		}
		else {
			System.out.print("sorry MAX_DIVE '-800' meters maximum\n");
		}
	}
	@Override
	public boolean speedUP(int makeSpeedUP_or_Down) {
		if (makeSpeedUP_or_Down <= 5 && makeSpeedUP_or_Down >= 0) 
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
	public String toString() {
		System.out.print("toString WaterAnimals\n");
		return (super.toString() + " Divedepth:" + get_diveDept());
		
	}
	private double get_diveDept() {return this.diveDept;};
	public void makeSound() 
	{
		System.out.print("Animal " + this.get_animal_name() + " said " + this.WaterAnimal_Sound);
	}


	
	
}
