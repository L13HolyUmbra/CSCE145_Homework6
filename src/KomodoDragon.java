/*
 * @Author Dion de Jong
 * @Version 1.0
 * @Date 10-24-13
 * This is the specific Komodo Dragon class, it inherits Reptile which inherits Animal.
 * It will then override the generic methods with specific information for each type of animal.
 * This is done so that the generic describe method can be called and it will call the specific information. 
 */ 

public class KomodoDragon extends Reptile {

	//Constructor specifically for Komodo Dragon, calls super and changes type to Komodo Dragon when it is constructed. 
	public KomodoDragon(String name) 
	{
		super(name);	
		super.setType("Komodo Dragon");
	}

	//override the generic methods with specific methods. 
	@Override
	public void makeSound() 
	{
		System.out.println("Growl...Hissssss");
	}

	@Override
	public void move() 
	{
		System.out.println("stomping around");
	}

	@Override
	public void getFood() 
	{
		System.out.println("biting it and possibly breathing fire on it");
	}

	@Override
	public void eatFood()
	{
		System.out.println("crushing it in its jaws");		
	}
}

