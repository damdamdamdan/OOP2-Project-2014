//Blackjack.java

public class Cards extends Blackjack
{	
	//Start array for the cards
	private int [] cards = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,
									10,10,10,10,10,10,10,10,11,11,11,11};	
	
	int playerScore;
	int dealerScore;
	
	
	public void player(){
		
		if(playerScore == 21)
		{
			//Player wins
			JOptionPane,showMessageDialog(null, "You win");
			System.exit(0);
		}
		if(playerScore >21)
		{
			JOptionPane.showMessageDialog(null, "You lose");
			System.exit(0);
		}
		if()
				
	}
}//end class

  