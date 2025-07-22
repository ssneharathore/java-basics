import java.util.Scanner;
public class test{
	public static void main(String args[]){
		 // Calling the System.lineSeparator() function to
        // print newline in between some specified strings
        String nl = System.lineSeparator();
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU:-");
		System.out.println("Pizza"+nl+"Burger"+nl+"Sandwich"+nl+"Pasta"+nl+"Cold coffee");
		System.out.println("Enter the food you want to order:");
		String orderedfood=sc.next();
		switch (orderedfood) {
		case "Pizza":
			System.out.println("you have ordered pizza."+nl+"Your bill is:90rs");
			break;
		case "Burger":
			System.out.println("you have ordered Burger."+nl+"Your bill is:49rs");
			break;
		case "Sandwich":
			System.out.println("you have ordered Sandwich."+nl+"Your bill is:60rs");
			break;
		case "Pasta":
			System.out.println("you have ordered Pasta."+nl+"Your bill is:120rs");
			break;
		case "Cold coffee":
			System.out.println("you have ordered Cold coffee."+nl+"Your bill is:45rs");
			break;
		}
	}
}