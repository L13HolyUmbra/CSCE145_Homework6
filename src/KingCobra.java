/*
 * @Author Dion de Jong
 * @Version 1.0
 * @Date 10-24-13
 * This is the specific King Cobra class, it inherits Reptile which inherits Animal.
 * It will then override the generic methods with specific information for each type of animal.
 * This is done so that the generic describe method can be called and it will call the specific information. 
 */ 

public class KingCobra extends Reptile {

	//Constructor specifically for King Cobra, calls super and changes type to King Cobra when it is constructed. 
	public KingCobra(String name) 
	{
		super(name);
		super.setType("King Cobra");
	}

	//override the generic methods with specific methods. 
	@Override
	public void makeSound() 
	{
		System.out.println("Ssssssssssss");
	}

	@Override
	public void move() 
	{
		System.out.println("slithering");
	}

	@Override
	public void getFood() 
	{
		System.out.println("poisoning it with venom");
	}

	@Override
	public void eatFood()
	{
		System.out.println("dissolving it");		
	}
}
