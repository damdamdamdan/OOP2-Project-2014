//Blackjack.java
import java.util.*;
import javax.swing.*;
public class Guests 
{	

	
	List<Person> guests;
	
	private int creditCard;
	private boolean cash = false;
	private int mobile;
	private int month;
	private int day;
	private int year;
	private int rDay;
	private int rMonth;
	private int rYear;
	private int price = 80;
	

	Person guest = new Person();

	guest.setForename(JOptionPane.showInputDialog("Please enter the forename:"));
	guest.setSurname (JOptionPane.showInputDialog("Please enter the surname:"));
	guest.setAge (Integer.parseInt(JOptionPane.showInputDialog("Please enter the age:")));
	guest.setGender(JOptionPane.showInputDialog("Please enter the gender:"));
	
	JOptionPane.showMessageDialog(null,guest.toString());






}//end Class