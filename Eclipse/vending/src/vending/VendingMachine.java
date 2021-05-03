package vending;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachine {
	
	VendingItem [] items;
	double money;
	
	public static void main(String [] args) {
		System.out.println("Welcome to our vending machine! What would you like to do?");
		VendingMachine vm = new VendingMachine(args[0]);
		Scanner input = new Scanner(System.in);
		int userActivity = 0;
		do 
		{
			System.out.println("What would you like to do?");
			System.out.println("1. Insert money");
			System.out.println("2. Display items");
			System.out.println("3. Select an item");
			System.out.println("4. Get change");
			userActivity=input.nextInt();
			switch(userActivity) 
			{
			case 1:
				System.out.println("How much money do you wish to insert?");
				double moneyInserted = input.nextDouble();
				vm.insertMoney(moneyInserted);
				break;
			case 2:
				vm.displayItems();
				break;
			case 3:
				System.out.println("What would you like to select?");
				int itemNum = input.nextInt();
				vm.selectItem(itemNum);;
				break;
			case 4:
				vm.getChange();
				break;
			}
		}
		while(userActivity!= 4);
	}
	
	public VendingMachine()
	{
		
	}
	
	public VendingMachine(String filename)
	{
		try {
			Scanner fileScanner = new Scanner(new File(filename));
			int numItems=fileScanner.nextInt();
			fileScanner.nextLine();
			items= new VendingItem[numItems];
			for (int i=0; i<numItems; i++) {
				items[i]= new VendingItem(fileScanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File problem.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertMoney(double moneyIn)
	{
		money+=moneyIn;
	}
	
	public void displayItems() {
		for (int i =0; i<items.length; i++)
		{
			System.out.println(items[i].toString());
		}
	}
	
	public void selectItem(int i) 
	{
		if (items[i].getPrice()<money && items[i].getQuantity()>0) {
			items[i].setQuantity(items[i].getQuantity()-1);
			money-=items[i].getPrice();
			System.out.println("Congratulations! You now own " + items[i].getName());
		}else {
			System.out.println("Sorry transaction cannot be completed at this time.");
		}
	}
	
	public void getChange()
	{
		System.out.println("Your change is "+ money);
		money = 0;
	}
}
