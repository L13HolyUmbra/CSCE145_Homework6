/*
 * @Author Dion de Jong
 * @Version 1.0
 * @Date 10-24-13
 * This is the specific Fox class, it inherits Mammal which inherits Animal.
 * It will then override the generic methods with specific information for each type of animal.
 * This is done so that the generic describe method can be called and it will call the specific information. 
 */ 

public class Fox extends Mammal {

	//Constructor specifically for Fox, calls super and changes type to Fox when it is constructed. 
	public Fox(String name) 
	{
		super(name);
		super.setType("Fox");
	}

	//override the generic methods with specific methods. 
	@Override
	public void makeSound() 
	{
		System.out.println("Ring-ding-ding-ding-dingeringeding! Gering-ding-ding-ding-dingeringeding! Gering-ding-ding-ding-dingeringeding!");
	}

	@Override
	public void move() 
	{
		System.out.println("lurking");
	}

	@Override
	public void getFood() 
	{
		System.out.println("catching it");
	}

	@Override
	public void eatFood()
	{
		System.out.println("munching it");		
	}
}
