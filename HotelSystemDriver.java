//Blackjack.java

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class HotelSystemDriver extends JFrame implements ActionListener  
{
	private Container cPane = getContentPane();
	private JMenuBar menubar;
	private JPanel panel = new JPanel();
		
	Person guest = new Person();
	Staff staff = new Staff();
	
//	LinkedList <Person> guests = new LinkedList(); 

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
		setTitle("Hotel");
		//makes the program exit the application when clicked on the close button
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//create JMenuBar
		menubar = new JMenuBar();
		setJMenuBar(menubar);	
			
		fileFileMenu();
		customersMenuFile();
		staffLogIn();
								
		cPane.setLayout(new FlowLayout());
		
		panel = new JPanel();
		cPane.add(panel);
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
	public void staffLogIn()
	{
		JLabel userName = new JLabel("Username:");
		panel.add(userName);
		
		JFormattedTextField username = new JFormattedTextField();
		username = new JFormattedTextField();
		username.setColumns(10);
		
		
		panel.add(username);
		this.setLocation(200,200);
		
		JPasswordField password = new JPasswordField();
		password = new JPasswordField();
		password.setColumns(10);
		
		panel.add(password);
		
	}//end staff log in
	public void fileFileMenu()
	{
		//create a file
		JMenu file = new JMenu("File");
		//add the file to the menubar
		menubar.add(file);
		
		//create items for the file
		JMenuItem saveFile = new JMenuItem("Save");
		file.add(saveFile);
		
		saveFile.addActionListener(this);
		
		JMenuItem statsItem = new JMenuItem("Statistics");
		file.add(statsItem);	
		
		//add action listener
		statsItem.addActionListener(this);
		
		JMenuItem loadFile = new JMenuItem("Load");
		file.add(loadFile);
		
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
	
	
	//Log in Button
	{
		JButton logIn = new JButton("Log in");
		cPane.add(logIn);
	
		logIn.addActionListener(this);
			
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Save"))
		{
			
		}//end i
		

	}//end actionPerformed
	
	
	
} //end class



