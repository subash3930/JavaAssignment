package project1more;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SubashTakeHomeProjectTest {

	public static void main(String[] args) {
	
		SubashTakeHomeProject ob = new SubashTakeHomeProject();
		String decision ="";
		double total=00.00;
		ob.displayMainMenu();
		DecimalFormat format = new DecimalFormat("0.00");
		do {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of people to be served:");
		int people = input.nextInt();
		if (people < 10) {
			System.out.println("we only serve more than 10 or more people,Sorry");
		} else {
			System.out.println("What would like to order: Italian||Chinese||American");
			String menuChoice = input.next();
			switch (menuChoice) {
			case "Italian":
				ob.displayItalianFoodMenu();
				System.out.println("Enter the choice menu number1||2||3:");
				int choice = input.nextInt();
				if (choice == 1) {
					int feeds = 5;
					double price = 17.99;
					int trays = ob.determineTrays(people, feeds);
					System.out.println("You need " + trays + " trays");
					System.out.println("Feeds " + feeds);
					double subtotal = ob.getSubtotal(price, trays);
					System.out.println(
							"The price for " + people + " people (" + trays + " trays) $" + format.format(subtotal));
					double tax = ob.getTax(subtotal, 0.07);
					System.out.println("Tax: $" + format.format(tax));
					double tip = ob.getTip(subtotal, 0.15);
					System.out.println("Tip: $" + format.format(tip));
					double grandtotal = ob.getGrandTotal(subtotal, tax, tip);
					System.out.println("Total(food,tax,tip):$" + format.format(grandtotal));
					double priceperperson = ob.pricePerPerson(grandtotal, people);
					System.out.println("Price per person : $" + format.format(priceperperson));
					int leftover = ob.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover servings for the delivery person: " + leftover);
					total=ob.getTotal(grandtotal, total);
				} else if (choice == 2) {
					int feeds = 7;
					double price = 15.99;
					int trays = ob.determineTrays(people, feeds);
					System.out.println("You need " + trays + " trays");
					System.out.println("Feeds " + feeds);
					double subtotal = ob.getSubtotal(price, trays);
					System.out.println("The price for " + people + " people (" + trays + " trays) $" + subtotal);
					double tax = ob.getTax(subtotal, 0.07);
					System.out.println("Tax: $" + format.format(tax));
					double tip = ob.getTip(subtotal, 0.15);
					System.out.println("Tip: $" + format.format(tip));
					double grandtotal = ob.getGrandTotal(subtotal, tax, tip);
					System.out.println("Total(food,tax,tip):$" + format.format(grandtotal));
					double priceperperson = ob.pricePerPerson(grandtotal, people);
					System.out.println("Price per person : $" + format.format(priceperperson));
					int leftover = ob.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover servings for the delivery person: " + leftover);
					total=ob.getTotal(grandtotal, total);
				} else {
					int feeds = 4;
					double price = 12.99;
					int trays = ob.determineTrays(people, feeds);
					System.out.println("You need " + trays + " trays");
					System.out.println("Feeds " + feeds);
					double subtotal = ob.getSubtotal(price, trays);
					System.out.println("The price for " + people + " people (" + trays + " trays) $" + subtotal);
					double tax = ob.getTax(subtotal, 0.07);
					System.out.println("Tax: $" + format.format(tax));
					double tip = ob.getTip(subtotal, 0.15);
					System.out.println("Tip: $" + format.format(tip));
					double grandtotal = ob.getGrandTotal(subtotal, tax, tip);
					System.out.println("Total(food,tax,tip):$" + grandtotal);
					double priceperperson = ob.pricePerPerson(grandtotal, people);
					System.out.println("Price per person : $" + priceperperson);
					int leftover = ob.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover servings for the delivery person: " + leftover);
					total=ob.getTotal(grandtotal, total);
				}
				break;
			case "Chinese":
				ob.displayChineseFoodMenu();
				System.out.println("Enter the choice menu number1||2||3:");
				int choice1 = input.nextInt();
				if (choice1 == 1) {
					int feeds = 7;
					double price = 18.99;
					int trays = ob.determineTrays(people, feeds);
					System.out.println("You need " + trays + " trays");
					System.out.println("Feeds " + feeds);
					double subtotal = ob.getSubtotal(price, trays);
					System.out.println(
							"The price for " + people + " people (" + trays + " trays) $" + format.format(subtotal));
					double tax = ob.getTax(subtotal, 0.07);
					System.out.println("Tax: $" + format.format(tax));
					double tip = ob.getTip(subtotal, 0.15);
					System.out.println("Tip: $" + format.format(tip));
					double grandtotal = ob.getGrandTotal(subtotal, tax, tip);
					System.out.println("Total(food,tax,tip):$" + format.format(grandtotal));
					double priceperperson = ob.pricePerPerson(grandtotal, people);
					System.out.println("Price per person : $" + format.format(priceperperson));
					int leftover = ob.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover servings for the delivery person: " + leftover);
					total=ob.getTotal(grandtotal, total);
				} else if (choice1 == 2) {
					int feeds = 7;
					double price = 18.99;
					int trays = ob.determineTrays(people, feeds);
					System.out.println("You need " + trays + " trays");
					System.out.println("Feeds " + feeds);
					double subtotal = ob.getSubtotal(price, trays);
					System.out.println("The price for " + people + " people (" + trays + " trays) $" + subtotal);
					double tax = ob.getTax(subtotal, 0.07);
					System.out.println("Tax: $" + format.format(tax));
					double tip = ob.getTip(subtotal, 0.15);
					System.out.println("Tip: $" + format.format(tip));
					double grandtotal = ob.getGrandTotal(subtotal, tax, tip);
					System.out.println("Total(food,tax,tip):$" + format.format(grandtotal));
					double priceperperson = ob.pricePerPerson(grandtotal, people);
					System.out.println("Price per person : $" + format.format(priceperperson));
					int leftover = ob.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover servings for the delivery person: " + leftover);

				} else {
					int feeds = 5;
					double price = 10.99;
					int trays = ob.determineTrays(people, feeds);
					System.out.println("You need " + trays + " trays");
					System.out.println("Feeds " + feeds);
					double subtotal = ob.getSubtotal(price, trays);
					System.out.println("The price for " + people + " people (" + trays + " trays) $" + format.format(subtotal));
					double tax = ob.getTax(subtotal, 0.07);
					System.out.println("Tax: $" + format.format(tax));
					double tip = ob.getTip(subtotal, 0.15);
					System.out.println("Tip: $" + format.format(tip));
					double grandtotal = ob.getGrandTotal(subtotal, tax, tip);
					System.out.println("Total(food,tax,tip):$" + format.format(grandtotal));
					double priceperperson = ob.pricePerPerson(grandtotal, people);
					System.out.println("Price per person : $" + format.format(priceperperson));
					int leftover = ob.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover servings for the delivery person: " + leftover);
					total=ob.getTotal(grandtotal, total);
				}

				break;
			case "American":
				ob.displayAmericanFoodMenu();
				System.out.println("Enter the choice menu number1||2||3:");
				int choice2 = input.nextInt();
				if (choice2 == 1) {
					int feeds = 8;
					double price = 21.99;
					int trays = ob.determineTrays(people, feeds);
					System.out.println("You need " + trays + " trays");
					System.out.println("Feeds " + feeds);
					double subtotal = ob.getSubtotal(price, trays);
					System.out.println(
							"The price for " + people + " people (" + trays + " trays) $" + format.format(subtotal));
					double tax = ob.getTax(subtotal, 0.07);
					System.out.println("Tax: $" + format.format(tax));
					double tip = ob.getTip(subtotal, 0.15);
					System.out.println("Tip: $" + format.format(tip));
					double grandtotal = ob.getGrandTotal(subtotal, tax, tip);
					System.out.println("Total(food,tax,tip):$" + format.format(grandtotal));
					double priceperperson = ob.pricePerPerson(grandtotal, people);
					System.out.println("Price per person : $" + format.format(priceperperson));
					int leftover = ob.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover servings for the delivery person: " + leftover);
					total=ob.getTotal(grandtotal, total);
				} else if (choice2 == 2) {
					int feeds = 5;
					double price = 22.99;
					int trays = ob.determineTrays(people, feeds);
					System.out.println("You need " + trays + " trays");
					System.out.println("Feeds " + feeds);
					double subtotal = ob.getSubtotal(price, trays);
					System.out.println("The price for " + people + " people (" + trays + " trays) $" + subtotal);
					double tax = ob.getTax(subtotal, 0.07);
					System.out.println("Tax: $" + format.format(tax));
					double tip = ob.getTip(subtotal, 0.15);
					System.out.println("Tip: $" + format.format(tip));
					double grandtotal = ob.getGrandTotal(subtotal, tax, tip);
					System.out.println("Total(food,tax,tip):$" + format.format(grandtotal));
					double priceperperson = ob.pricePerPerson(grandtotal, people);
					System.out.println("Price per person : $" + format.format(priceperperson));
					int leftover = ob.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover servings for the delivery person: " + leftover);
					total=ob.getTotal(grandtotal, total);
				} else {
					int feeds = 10;
					double price = 26.99;
					int trays = ob.determineTrays(people, feeds);
					System.out.println("You need " + trays + " trays");
					System.out.println("Feeds " + feeds);
					double subtotal = ob.getSubtotal(price, trays);
					System.out.println("The price for " + people + " people (" + trays + " trays) $" + subtotal);
					double tax = ob.getTax(subtotal, 0.07);
					System.out.println("Tax: $" + format.format(tax));
					double tip = ob.getTip(subtotal, 0.15);
					System.out.println("Tip: $" + format.format(tip));
					double grandtotal = ob.getGrandTotal(subtotal, tax, tip);
					System.out.println("Total(food,tax,tip):$" + format.format(grandtotal));
					double priceperperson = ob.pricePerPerson(grandtotal, people);
					System.out.println("Price per person : $" + format.format(priceperperson));
					int leftover = ob.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover servings for the delivery person: " + leftover);
					total=ob.getTotal(grandtotal, total);
				}
				break;

			default:
				System.out.println("Wrong choice");
				break;
			}
			
		}
		System.out.println("Would you like to continue order? Press Y||N");
		decision = input.next();
		
		}while(decision.equalsIgnoreCase("Y"));
        System.out.println("The total is: $"+ format.format(total));
	}

}
