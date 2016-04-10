/*
 * @Author Dion de Jong
 * @Version 1.0
 * @Date 10-24-13
 * This is the basic Mammal class, it keeps all the generic abstract methods
 * from Animal and creates a new constructor. 
 */

public abstract class Mammal extends Animal {

	//A constructor for mammal that just calls the constructor from Animal with Super
	public Mammal(String name)
	{
		super(name); 
	}

}
