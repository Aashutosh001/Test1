import java.util.*;
public class PizzaHut {

	public static void main(String[] args) {
	Pizza p = new Pizza();
	ChickenPizza c = new ChickenPizza();
	MuttonPizza m = new MuttonPizza();
	int ch;
	do {
		Scanner s= new Scanner(System.in);
	System.out.println("Price of Chicken Pizza: Rs 276 and Mutton Pizza: Rs 479");
	System.out.println("Please select choice \n 1. Chicken Pizza \n 2. Mutton Pizza:");
	ch =s.nextInt();
	switch(ch)
	{
	case 1:
	{
		System.out.println("For CHICKEN PIZZA");
		c.display();
		break;
	}
	case 2:
	{

		System.out.println("For MUTTON PIZZA");
		m.display();
		break;
	}
	default:
	{
		System.out.println("Wrong input!");
		break;
	}
	}
	}while(ch>3);
	}
	
}