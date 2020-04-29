package Package_System;

import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
/*
Evgeny Erdley 320882053
Ariel Yohimovich 204634588
Ashdod
*/
import java.util.Scanner;

import Package_Animals.Animal;
import Package_Animals.CAT;
// LinkedList<Address> ml = new LinkedList<Address>();
//ArrayList<Object> a = new ArrayList<Object>();
public class System_Program {
	private static boolean program_on = true ;
	private static int counter= 0;
	private static ArrayList<Object> array_of_objects;
	public static void main(String[] args) {
		System.out.println("---- Program Starts ---- \n");
		Scanner input = new Scanner(System.in);
		System.out.println("How many Animals YOU want? \n");
		int animals_input = input.nextInt();
		array_of_objects = new ArrayList<Object>();
		// try {} catch(Exception e) {} here
		do {
			if(counter < animals_input) {
				program_on = true;
			}
			else {
				System.out.println("exit to much\n");
				program_on = false;
				System.exit(0);
			}
			System.out.println("You chose " + animals_input + " animals. \n");
			System.out.println("Now you need chose Animal_type \n");
			System.out.println("1. _TerrestrialAnimals_ \n");
			System.out.println("2. _WaterAnimal_ \n");
			System.out.println("3. _AirAnimal_ \n");
			System.out.println("4. EXIT Program \n");
			int animals_type = input.nextInt();
			if(animals_type == 1) { // Terrestrial
				System.out.println("Now you need chose Terrestrial_Animal \n");
				System.out.println("1. _DOG_ \n");
				System.out.println("2. _CAT_ \n");
				System.out.println("3. _SNAKE_ \n");
				int terrestrial_animal = input.nextInt();
				if(terrestrial_animal == 1) { System.out.println("Creating DOG \n");}
				else if (terrestrial_animal == 2) 
				{
					System.out.println("------Creating CAT----- \n");

					CAT cat = new CAT("Leo","Male",3.2,2,0,20,4,true);
					array_of_objects.add(cat);
					counter++;
					System.out.println(array_of_objects.get(0).toString()); 
					//((Animal)array_of_objects.get(0)).makeSound();
				}
				else if (terrestrial_animal == 3) {System.out.println("------Creating SNAKE----- \n");}
				else {System.out.println("exit \n");}
			}
			else if (animals_type == 2) { // Water
				System.out.println("Now you need chose Water_Animal \n");
				System.out.println("4. _Alligator_ \n");
				System.out.println("5. _Whale_ \n");
				System.out.println("6. _Dolphin_ \n");
				int water_animal = input.nextInt();
				if(water_animal == 4) {System.out.println("---------Creating Alligator------ \n");}
				else if (water_animal == 5) {System.out.println("-------Creating Whale------- \n");}
				else if (water_animal == 6) {System.out.println("------Creating Dolphin------ \n");}
				else {System.out.println("exit \n");}
			}
			else if (animals_type == 3) { // Air
				System.out.println("Now you need chose Air_Animal \n");
				System.out.println("7. _Eagle_ \n");
				System.out.println("9. _Pigeon_ \n");
				int air_animal = input.nextInt();
				if(air_animal == 7) {System.out.println("------Creating Eagle------ \n");}
				else if (air_animal == 9) {System.out.println("-------Creating Pigeon------ \n");}
			//	else if (air_animal == 3) {System.out.println("Creating Missing \n")}
				else {System.out.println("exit \n");}
			}
			else {
				program_on = false;
				System.out.println("Exit program \n");
			}
		} while (program_on); // until animals_input ARRAY FULL
		
	}

}
