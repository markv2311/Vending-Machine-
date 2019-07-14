import java.util.*;

public class vending 
{
	public static void main (String args[]) 
	{
		vmprint display = new vmprint();
		slot prices = new slot(1.25, 1.25, 1.25, 2.00, 2.00, 2.00);
		slot vm [] [] = new slot [2] [3];//vending machine with 3x3 rows 
		for (int i =0; i<2; i++)
		{
			for (int j = 0; j<3; j++)//making it create the array and what is inside of it 
			{
				vm [i] [j] = new slot(1.25, 1.25, 1.25, 2.00, 2.00, 2.00);
			}
		}
		vm [0] [0].setskittles();
		vm [0] [1].setstarburst();
		vm [0] [2].setsourpatch();
		vm [1] [0].sethershey();
		vm [1] [1].setcrunch();
		vm [1] [2].setkitkat();

		boolean customer = false; 
		Scanner input = new Scanner (System.in);
		// need to put a while loop so that it keeps repeating everything 
		while (customer == false){
			display.printv();
			System.out.println ("Press 1 for a price or press 2 for a purchase.");
			int decide = input.nextInt();
			if (decide == 1){
				System.out.println ("Which item would you like to know the cost of?");
				int item = input.nextInt();
				
				switch (item){
					case 1: 
						System.out.println("Skittles are " + prices.getskittles());
						break;
					case 2: 
						System.out.println("Starburst are " + prices.getstarburst());
						break;
					case 3:
						System.out.println("Sourpatch are " + prices.getsour());
						break;
					case 4: 
						System.out.println("Hershey bars are " + prices.gethershey());
						break;
					case 5: 
						System.out.println("Crunch bars are " + prices.getcrun());
						break;
					case 6: 
						System.out.println("A KitKat is " + prices.getkit());
						break;
				}
			}
			else{
				System.out.println("Which item would you like to buy?");
				int candy = input.nextInt();
				switch (candy) {
					case 1: 
					try {
						Thread.sleep(1000);
						System.out.println("Dispensing");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						
					}
					catch (InterruptedException e) 
					{
						System.out.println("Error");
					}
						System.out.println("You got skittles!");
						customer = true;
						break;
					case 2: 
					try {
						Thread.sleep(1000);
						System.out.println("Dispensing");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						
					}
					catch (InterruptedException e) 
					{
						System.out.println("Error");
					}
						System.out.println("You got starburst!");
						customer = true;
						break;
					case 3: 
					try {
						Thread.sleep(1000);
						System.out.println("Dispensing");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						
					}
					catch (InterruptedException e) 
					{
						System.out.println("Error");
					}
						System.out.println("You got sourpatch!");
						customer = true;
						break;
					case 4: 
					try {
						Thread.sleep(1000);
						System.out.println("Dispensing");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						
					}
					catch (InterruptedException e) 
					{
						System.out.println("Error");
					}
						System.out.println("You got a Hershey bar!");
						customer = true;
						break;
					case 5: 
					try {
						Thread.sleep(1000);
						System.out.println("Dispensing");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						
					}
					catch (InterruptedException e) 
					{
						System.out.println("Error");
					}
						System.out.println("You got a crunch bar!");
						customer = true;
						break;
					case 6: 
					try {
						Thread.sleep(1000);
						System.out.println("Dispensing");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						
					}
					catch (InterruptedException e) 
					{
						System.out.println("Error");
					}
						System.out.println("You got a KitKat!");
						customer = true;
						break;
				}
			}
		}
	

	}
	
}
