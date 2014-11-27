//Exercise1.java

import java.util.Scanner;
public class Exercise1 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String name, className;
		int snacks, price;
		
		System.out.println("Please enter your name:");
		name = input.nextLine();
		
		
		System.out.println("Please enter your class number:");
		className = input.nextLine();
		
		System.out.println("How many snacks would you like to buy?");
		snacks = input.nextInt();
		
		price = snacks*2;
		
		System.out.print(""+name+" of class "+className+" you have ordered "+snacks+". You OWE us €"+price);
		
		
	}
}