//Blackjack.java

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class BlackJackGame extends JFrame implements ActionListener  
{
	Container cPane = getContentPane();
	private JMenuBar menubar;

	public static void main(String args[])
	{
		Blackjack window = new Blackjack();
		window.setVisible(true);
		
		Cards cards = new Cards();

		
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
		helpMenuFile();
		gameButtons();
								
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
		
	}//end gameFileMemu construtor
	
	//create game menu in the bar
	public void helpMenuFile()
	{
		//create a file call help
		JMenuItem helpMenu = new JMenuItem("Help");
		menubar.add(helpMenu);
		
		//add actionListener to give function to the button
		helpMenu.addActionListener(this);
	}//end helpMenu constructor
	
	//adding the hit and stay button
	public void gameButtons()
	{
		JButton hitButton = new JButton("Hit");
		cPane.add(hitButton);
		hitButton.setLocation(200,500);
		
		hitButton.addActionListener(this);
	
		
		JButton stayButton = new JButton("Stay");
		cPane.add(stayButton);
		stayButton.setLocation(450,500);
		
		stayButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Help"))
		{
			JOptionPane.showMessageDialog(null,"The object of the game is to draw cards totaling to  21 without drawing over, cards 2-10 are worth their face value while \n"
										+"kings, queens and jacks are worth 10, aces are equal to 1 or 11. At the start of the game you are given 2 cards, you can then \n"
										+"either hit to get another card, or stand to face of the oponent with what you have.");
		}//end if "Help"
		
		if(e.getActionComand().equals("Hit"))
		{
			hit();
		}
		
		if(e.getActionCommand().equals("Stay"))
		{
			Cards.Stay();
		}
	}//end actionPerformed
	
} //end class



