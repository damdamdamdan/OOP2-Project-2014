//Blackjack.java

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class HotelSystemDriver extends JFrame implements ActionListener  
{
	Container cPane = getContentPane();
	private JMenuBar menubar;

	public static void main(String args[])
	{
		HotelSystemDriver window = new HotelSystemDriver();
		window.setVisible(true);
		
				
	}// end main
	
	//start no operator constructor
	public HotelSystemDriver()
	{
		setSize(800,800);
		
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
			
		fileMenuFile();
		customerMenuFile();
	//	gameButtons();
								
		cPane.setLayout(null);
		
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
	
	//create the game menu in the bar
	public void fileFileMenu()
	{
		//create a file
		JMenu file = new JMenu("File");
		//add the file to the menubar
		menubar.add(file);
		
		//create items for the file
		JMenuItem saveFile = new JMenuItem("Save");
		fileFile.add(saveFile);
		
		saveFile.addActionListener(this);
		
		JMenuItem statsItem = new JMenuItem("Statistics");
		fileFile.add(statsItem);	
		
		//add action listener
		statsItem.addActionListener(this);
		
		JMenuItem loadFile = new JMenuItem("Load");
		fileFile.add(loadFile);
		
		loadFile.addActionListener(this);
	}//end fileFileMemu construtor
	
	//create a customors menuy
	public void customersMenuFile()
	{
		//create a file call help
		JMenu customerMenu = new JMenu("Customers");
		menubar.add(customerMenu);
		
		JMenuItem newCustomer = new JMenu("New Customer");
		customerMenu.add(newCustomer);
		
		newCustomer.addActionListener(this);
	}//end customerMenuFile constructor
	
	//adding the hit and stay button
//buttons, no use as of now	public void gameButtons()
	{
		JButton hitButton = new JButton("Hit");
		cPane.add(hitButton);
	
		hitButton.addActionListener(this);
		
		
		
		JButton stayButton = new JButton("Stay");
		cPane.add(stayButton);
	
	
		stayButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Save"))
		{
			
		}//end i
		

	}//end actionPerformed
	
	
	
} //end class



