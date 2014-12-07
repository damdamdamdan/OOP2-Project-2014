//Blackjack.java

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class HotelSystemDriver extends JFrame implements ActionListener  
{
	private Container cPane = getContentPane();
	private JMenuBar menubar;
	private JPanel panel = new JPanel(new GridBagLayout());
			
	Person guest = new Person();
	Staff staff = new Staff();
	
	LinkedList <Person> guests = new LinkedList(); 

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
			/*****************************************************
*    Title:  Java Tutorial 12: Arranging Component on Frame / Panel in Java
*    Author: Creativity Tuts
*    Site owner/sponsor:  www.youtube.com
*    Date: 07/12/2014
*    Code version:  
*    Availability: https://www.youtube.com/watch?v=eeE44RmE1FM
*    Modified:  
*****************************************************/	
		
		GridBagConstraints con = new GridBagConstraints();
		//create border around everything
		con.insets = new Insets(10,10,10,10);
		
		//create a label to inform the staff of what to input into the box
		JLabel userName = new JLabel("Username:");
		
		//set location
		con.gridx = 10;
		con.gridy = 10;
		
		//add the label to the panel
		panel.add(userName,con);
		
		
				/*****************************************************
*    Title:  How to Use Text Fields
*    Author: Oracle
*    Site owner/sponsor:  www.docs.oracle.com
*    Date: 07/12/2014
*    Code version:  
*    Availability:  https://docs.oracle.com/javase/tutorial/uiswing/components/textfield.html
*    Modified:  
*****************************************************/	

		JFormattedTextField username = new JFormattedTextField();
		
		//create a text field for user input
		username = new JFormattedTextField();
		
		//set size
		username.setColumns(10); 
		
		//set location	
		con.gridx = 15;
		con.gridy = 10;	
		
		//add a listener
		username.addActionListener(this);
		
		//add to the panel
		panel.add(username, con);
		
		//create a label to inform the user of what to do
		JLabel pass = new JLabel("Password:");
		
		//set location
		con.gridx = 10;
		con.gridy = 12;
		
		//add to the panel
		panel.add(pass,con);		
		
		//create a textbox for a password
		JPasswordField password = new JPasswordField();
		password = new JPasswordField();
		
		//set the size of the textbox
		password.setColumns(10);
		
		//set the location
		con.gridx = 15;
		con.gridy = 12;
		
		//add a listener
		password.addActionListener(this);
		
		//add the box to the panel
		panel.add(password,con);
		
		//create a jButton
		JButton logIn = new JButton("Log in");
		
		//set the location
		con.gridx = 15;
		con.gridy = 15;
		
		//add the button to the panel
		panel.add(logIn,con);
		
		//add action listener to the button
		logIn.addActionListener(this);
		
		// add he button to the panel
		cPane.add(panel);
		
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
		
		//add listener
		saveFile.addActionListener(this);
		
	/*	//create an item in JMenu
		JMenuItem recordsItem = new JMenuItem("Records");
		
		//add item to the menu
		file.add(recordsItem);	
		
		//add action listener
		recordsItem.addActionListener(this);
		*/
		
		//create an item in the JMenu
		JMenuItem loadFile = new JMenuItem("Load");
		
		//add item to the menu
		file.add(loadFile);
		
		//add action listener
		loadFile.addActionListener(this);
	}//end fileFileMemu construtor
	
	//create a customors menuy
	public void customersMenuFile()
	{
		//create a customer Menu JMenu
		JMenu customerMenu = new JMenu("Customers");
		
		//add the customerMenu to the menubar
		menubar.add(customerMenu);
		
		//create an item for the customerMenu
		JMenuItem newCustomer = new JMenu("New Customer");
		
		//add the item to the customerMenu
		customerMenu.add(newCustomer);
		
		//add actionListener
		newCustomer.addActionListener(this);
		
	}//end customerMenuFile constructor
	
	public void save() throws IOException
	{
		ObjectOutputStream outputStream;
		outputStream = new ObjectOutputStream(new FileOutputStream("guest.dat"));
		outputStream.writeObject(guests);
		outputStream.close();
	}//end save(
		
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Save"))
		{
			save();
		}//end save
		
		if(e.getActionCommand().equals(""))
		{
			
		}
		

	}//end actionPerformed
	
	
	
} //end class



