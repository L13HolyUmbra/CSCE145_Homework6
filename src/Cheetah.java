/*
 * @Author Dion de Jong
 * @Version 1.0
 * @Date 10-24-13
 * This is the specific Cheetah class, it inherits Mammal which inherits Animal.
 * It will then override the generic methods with specific information for each type of animal.
 * This is done so that the generic describe method can be called and it will call the specific information. 
 */ 

public class Cheetah extends Mammal {

	//Constructor specifically for Cheetah, calls super and changes type to Cheetah when it is constructed. 
	public Cheetah(String name) 
	{
		super(name);
		super.setType("Cheetah");
	}


	//override the generic methods with specific methods. 
	@Override
	public void makeSound() 
	{
		System.out.println("ROAR... meow?");
	}

	@Override
	public void move() 
	{
		System.out.println("running really fast");
	}

	@Override
	public void getFood() 
	{
		System.out.println("being faster than everything");
	}

	@Override
	public void eatFood()
	{
		System.out.println("ferorciously tearing his prey's flesh apart");		
	}
}
