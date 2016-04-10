/*
 * @Author Dion de Jong
 * @Version 1.0
 * @Date 10-24-13
 * This is the basic animal class, it will create methods for a generic
 * animal. It will become the super class for all the other subclasses created
 * for the types of animals and individual organisms. 
 */

public abstract class Animal {

	//instance variables
	private String name;
	private static String type; 

	//Constructor
	public Animal(String name)
	{
		this.name = name; 
	}

	//Getters and Setters for Type 
	public static String getType() 
	{
		return type;
	}

	public static void setType(String type1) 
	{
		type = type1;
	}

	//the generic methods that will be used in Describe once they are defined in the specific classes
	public abstract void makeSound(); 

	public abstract void move();

	public abstract void getFood();

	public abstract void eatFood();

	//Generate the outline for how describe will display the data once all of the info has been 
	public void describe()
	{
		System.out.println(name + " is a " + type);
		System.out.print(name + " says: ");
		makeSound(); 
		System.out.print(name + " moves by ");
		move(); 
		System.out.print(name + " gets its food by ");
		getFood();
		System.out.print("and eats it by " );
		eatFood(); 
	}

}
