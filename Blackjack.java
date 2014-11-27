//Blackjack.java

import java.awt.event.*;
import java.awt.*;


public class Blackjack extends JFrame implements ActionListener  
{
	public static void main(String args[])
	{
		Blackjack window = new Blackjack();
		window.setVisible(true);

		
	}// end main
	
	//start no operator constructor
	public Blackjack()
	{
		setSize(600,600);
		
			/*****************************************************
*    Title:  
*    Author: Hovercraft Full Of Eels
*    Site owner/sponsor:  stackoverflow.com
*    Date: 
*    Code version:  
*    Availability:  http://stackoverflow.com/questions/9543320/how-to-position-the-form-in-the-center-screen
*    Modified:  
*****************************************************/	
		//set location to centre
		setLocationRelativeTo(null);
		//set title
		setTitle("Blackjack");
		//makes the program exit the application when clicked on the close button
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//create JMenuBar
		menubar = new JMenuBar();
		setJMenuBar(menubar);		
		
	}//end no operator constructor
	
	//create the file menu in the bar
	public void createFileMenu()
	{
		//create a file called File
		JMenu fileMenu = new JMenu("File");
		//add the file to the menubar
		menubar.add(fileMenu);
		
		
		
		
	}
	
	
} //end class



