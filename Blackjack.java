//Blackjack.java

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Blackjack extends JFrame //implements ActionListener  
{
	Container cPane = getContentPane();
	private JMenuBar menubar;
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
			
		gameFileMenu();
		helpMenu();
			
		cPane.setLayout(new FlowLayout());
		
			/*****************************************************
*    Title:  
*    Author: Brian Pipa
*    Site owner/sponsor:  www.coderanch.com
*    Date: 
*    Code version:  
*    Availability:  http://www.coderanch.com/t/337333/GUI/java/hex-set-background-color
*    Modified:  
*****************************************************/	
		//setting the background color in hex
		cPane.setBackground(Color.decode("#006400"));	
		
	}//end no operator constructor
	
	//create the file menu in the bar
	public void gameFileMenu()
	{
		//create a file called File
		JMenu gameMenu = new JMenu("Game");
		//add the file to the menubar
		menubar.add(gameMenu);
		
		//create items for the file
		JMenuItem newGameItem = new JMenuItem("New Game");
		gameMenu.add(newGameItem);
		
		JMenuItem statsItem = new JMenuItem("Statistics");
		gameMenu.add(statsItem);	
		
		
	}
	public void helpMenu()
	{
		JMenu helpMenu = new JMenu("Help");
		menubar.add(helpMenu);
	}
	
	
} //end class



