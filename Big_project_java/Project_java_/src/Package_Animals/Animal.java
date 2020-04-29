package Package_Animals;

import java.awt.Point;

import Package_Mobility.Mobile;
import Package_Olympics.Medal;

enum Gender
{ 
    Male, Female, Hermaphrodite; 
}

public abstract class Animal extends Mobile implements IReptile {


	private String name;
	private Gender gender_1;
	private double weight;
	private double speed;
	protected Medal[] medals; // not used yet
//	private Point postion;
	
	Animal(String name, String gender,double weight,double speed,int point_x,int point_y) {
		super(point_x,point_y);
		this.name = name;
		this.gender_1 = Gender.valueOf(gender); //Gender (enum class) gender
		this.weight = weight;
		this.speed = speed;

	}
	
	public abstract void makeSound();
	protected String get_animal_name() {return this.name;}
	protected void set_spcific_Animal_speed(double new_speed) 
	{
		this.speed = new_speed;
	}
	protected double get_spcific_Animal_speed() {return this.speed;};
	
	public String toString() {
		return (super.toString() + " Name: " + this.get_name() + " Gender: " + this.get_gender_1() + " weight: " + this.get_weight() + " speed: " + this.get_speed());
		
	}
	private String get_name() {return this.name;};
	private Gender get_gender_1() {return this.gender_1;};
	private double get_weight() {return this.weight;};
	private double get_speed() {return this.speed;};
	private Medal[] get_medals() {return this.medals;};
	
}
