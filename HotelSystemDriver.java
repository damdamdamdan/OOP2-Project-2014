//Blackjack.java

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;



public class HotelSystemDriver extends JFrame implements ActionListener  
{
	//create a container
	private Container cPane = getContentPane();
	
	//create a JMenubar
	private JMenuBar menubar;
	
	//create a JButton
	JButton login;
	
	//creat JTextField for username
	private JTextField username;
	
	//create JPasswordField for the password input
	private JPasswordField password;
	
	//create a panel
	private JPanel panel = new JPanel(new GridBagLayout());
	
	//create a person		
	Person guest = new Person();
	
	//create a staff member
	Staff staff = new Staff();	
		
	//create a linkedlist to store the guests
	LinkedList <Person> guests = new LinkedList(); 

	public static void main(String args[])
	{
		//create a winow to display the gui elements on
		HotelSystemDriver window = new HotelSystemDriver();
		
		//make the window visible
		window.setVisible(true);				
	}// end main
	
	//start no operator constructor
	public HotelSystemDriver()
	{
		//set up the size of the scrren
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
		setTitle("Hotel");
		
		//makes the program exit the application when clicked on the close button
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//create JMenuBar
		menubar = new JMenuBar();
		setJMenuBar(menubar);	
			
		//call methods
		fileFileMenu();
		guestMenuFile();
		staffLogIn();
	
		//set layout for the container		
		cPane.setLayout(new FlowLayout());	
		
		//turn of the container till login succeful
		menubar.setVisible(false);
			
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
		cPane.setBackground(Color.decode("#393939"));				
			
		//create a staff member
		staff.setStaffId("user1");
		
		//create a password for staff
		staff.setPassword("abcdefg");
		
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
		panel.setBackground(Color.decode("#FF5A09"));
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
		
		JTextField username;
	   		
		//create a text field for user input
		username = new JTextField(10);
					
		//set location	
		con.gridx = 15;
		con.gridy = 10;	
		
		username.requestFocus();
		
		
		//add a listener
	//	username.getDocument().addDocumentListener(documentListener);		
		
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
		
		password.addActionListener(this);
	//	password.getDocument().addDocumentListener(documentListener);		
		
		//add the box to the panel
		panel.add(password,con);
		
		//create a jButton
		JButton login = new JButton("Log In");
		
		//set the location
		con.gridx = 15;
		con.gridy = 15;
		
		//add the button to the panel
		panel.add(login,con);
		
		//add action listener to the button
		login.addActionListener(this);
		
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
		
		//create an item in the JMenu
		JMenuItem loadFile = new JMenuItem("Load");
		
		//add item to the menu
		file.add(loadFile);
		
		//add action listener
		loadFile.addActionListener(this);
	}//end fileFileMemu construtor
	
	//create a guest menu file
	public void guestMenuFile()
	{
		//create a guest Menu JMenu
		JMenu guestMenu = new JMenu("Guest");
		
		//add the customerMenu to the menubar
		menubar.add(guestMenu);
		
		//create an item for the customerMenu
		JMenuItem newGuest = new JMenuItem("New Guest");
		
		//add the item to the customerMenu
		guestMenu.add(newGuest);
		
		//add actionListener
		newGuest.addActionListener(this);
		
	}//end customerMenuFile constructor
	
	public void save() throws FileNotFoundException, IOException
	{
		//create a file called guestsFile.dat
		File guestsFile = new File("guestsFile.dat");
		
		//create a file output stream
		FileOutputStream fos = new FileOutputStream(guestsFile);
		
		//create object output stream
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//write the guests into the object output stream
		oos.writeObject(guests);
		
		//close the stream
		oos.close();
		
		JOptionPane.showMessageDialog(null,"Saved.");
	}//end save(
		
	public void load()
	{
		try
		{
			//create an input stream
			ObjectInputStream inputStream;
			
			//find the saved file to load
			inputStream = new ObjectInputStream(new FileInputStream("guestsFile.dat"));
			
			//create a linkedlist fronm the file
			guests = (LinkedList<Person>)inputStream.readObject();
			
			//close the stream
			inputStream.close();
		}
		
		//catch the exception
		catch(Exception l)
		{
			l.printStackTrace();
		}
	}
	public void guestList()
	{		
		for(Person p:guests){
		  JOptionPane.showMessageDialog(null,p.toString());
		}

	}//end guestList
		
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Save"))
		{
		try
		{
			save();
		}
		//catch the file not found exception
		catch(FileNotFoundException f)
			{
			
				f.printStackTrace();
			}
		//catch the io exception
		catch(IOException i)
			{
				i.printStackTrace();
			}		
			
		}//end save
		
		if(e.getActionCommand().equals("Guests"))
		{
			load();	
			guestList();
		}	
		
		String user = username.getText();
			
	
	/*	if(e.getActionCommand().equals("Log In") && username.getText().equals("staff.getStaffId()") && password.getText().equals("staff.getPassword()"))
			{
				menubar.setVisible(true);
				panel.setVisible(false);
				System.out.println("hi");
			}*/
		if(e.getActionCommand().equals("Log In"))
			{
				System.out.println(user);
				
			//	JOptionPane.showMessageDialog(username.getText().toString());
			//	JOptionPane.showMessageDialog(null,"Invalid!, please try again"+username.getText()+"+password.getText()+");
			}
			
		
		if(e.getActionCommand().equals("New Guest"))
		{
			guest.setForename(JOptionPane.showInputDialog("Please enter the forename:"));
			guest.setSurname(JOptionPane.showInputDialog("Please enter the surname:"));
			guest.setAge(Integer.parseInt(JOptionPane.showInputDialog("Please enter the age:")));
			guest.setNumber(Integer.parseInt(JOptionPane.showInputDialog("Please enter the mobile number:")));
			
			JOptionPane.showMessageDialog(null,(guest.toString())+"\n\n\nRecord Stored");
			
		}
		if(e.getActionCommand().equals("Load"))
		{
			load();
			guestList();
		}
		
		if(password.getText() == "hi")
		{
			System.out.println("sd");
		}
	
		/*
		DocumentListener documentListener = new DocumentListener() {
			
			public void changedUpdate(DocumentEvent documentEvent) {
		        if(username.getText() == staff.getStaffId())
		        	System.out.println("yes");
		      }
		    public void insertUpdate(DocumentEvent documentEvent) {
		    //    printIt(documentEvent);
		      }
		    public void removeUpdate(DocumentEvent documentEvent) {
		     //   printIt(documentEvent);
		      }				
		};
	*/
	}
	

	
} //end class



