/*
 * @Author Dion de Jong
 * @Version 1.0
 * @Date 10-24-13
 * This is the basic Reptile class, it keeps all the generic abstract methods
 * from Animal and creates a new constructor. 
 */

//A constructor for mammal that just calls the constructor from Animal with Super
public abstract class Reptile extends Animal {

	public Reptile(String name)
	{
		super(name); 
	}


}
