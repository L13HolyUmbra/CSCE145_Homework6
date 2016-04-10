/*
 * @Author Dion de Jong
 * @Version 1.0
 * @Date 10-24-13
 * This is the driver class that will test all the methods and classes that were 
 * created. It will create a bunch of objects and call the display method. Wooh!
 */ 

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create on object from each specific animal and display it.
		System.out.println("");
		Cheetah Cheetah1 = new Cheetah("Chester"); 
		Cheetah1.describe(); 

		System.out.println("");
		Fox fox1  = new Fox("Kurama"); 
		fox1.describe(); 

		System.out.println("");
		KingCobra snake1 = new KingCobra("Kaa"); 
		snake1.describe(); 

		System.out.println("");
		KomodoDragon KD= new KomodoDragon("Alduin"); 
		KD.describe(); 

		//create the objects that will later be described in the array. 
		KomodoDragon KD2= new KomodoDragon("Dovah");
		KomodoDragon KD3= new KomodoDragon("Paarthurnax");
		KomodoDragon KD4= new KomodoDragon("Fusrohdah");
		Fox fox2 = new Fox("Swiper");
		Fox fox3 = new Fox("Vulpix"); 		

		//create an animal object array that uses the ones we just made. 
		Animal[] Family = {KD2, KD3, KD4, fox2, fox3}; 

		//create the for loop that will iterate 5 times so that each of the 5 animal objects gets the describe method called on it. 
		for (int i = 0; i < 5; i ++) 
		{
			//Because Type was made static in the animal class, each object must be specifically called and tested to make sure type is the correct value for that object.
			//To do this, we must get the class of the object and change the type to that class's name. 
			if (Family[i].getClass().toString().equals("class KomodoDragon"))
			{
				Animal.setType("Komodo Dragon");
			}
			else if (Family[i].getClass().toString().equals("class Fox"))
			{
				Animal.setType("Fox");
			}
			//call describe in each iteration. 
			System.out.println("");
			Family[i].describe();
		}

	}

}
