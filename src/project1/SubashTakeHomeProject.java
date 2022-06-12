package project1;

public class SubashTakeHomeProject {

	public static void displayMainMenu() {
		System.out.println("Here is the menu:");
		System.out.println("++Italian Food Menu++");
		System.out.println("--Chinese Food Menu--");
		System.out.println("**American Food Menu**");
	}

	public static void displayItalianFoodMenu() {
		System.out.println("1. Lasagna Tray - Feeds 5 - 17.99\r\n" + "2. Pizza Pack - Feeds 7 - 15.99\r\n"
				+ "3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");

	}

	public static void displayChineseFoodMenu() {
		System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99\r\n"
				+ "2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99\r\n"
				+ "3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");
	}

	public static void displayAmericanFoodMenu() {
		System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99\r\n"
				+ "2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -\r\n"
				+ "22.99\r\n" + "3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");

	}

	public static int determineTrays(int people, int feeds) {
        int trays;
		if (people % feeds != 0) {
			trays = people / feeds + 1;
		} else {
			trays = people / feeds;
		}
		return trays;

	}

	public static double getSubtotal(double price, int trays) {
		double subtotal = price * trays;
		return subtotal;

	}
	public static double getTax(double subtotal, double taxrate) {
		double tax=subtotal*taxrate;
		return  tax;
	}
	public static double getTip(double subtotal, double tipRate) {
		double tip=subtotal*tipRate;
		return tip;
	}
	public static double getGrandTotal(double subtotal, double tax, double tip) {
		double grandtotal=subtotal+tax+tip;
		return grandtotal;
		}
	
		public static double pricePerPerson(double grandTotal, int people) {
		double priceperperson=grandTotal/people; 
		return priceperperson;
			
		}
		public static int determineLeftOvers(int feeds, int trays, int people) {
			int leftOver=feeds*trays-people;
			return leftOver;
		}
		
		
	}

