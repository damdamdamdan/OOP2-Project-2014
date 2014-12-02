//Blackjack.java

public class Cards extends BlackJackGame
{	
	//Start array for the cards
	Random random = new Random();
	private int [] cards = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,
									10,10,10,10,10,10,10,10,11,11,11,11};	
	
	int playerScore;
	int dealerScore;
	
	
	public void playerS()
	{		
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
	
	//call the players hand
	public void playerHand()
	{
		int hand = random.nextInt(cards[0].length + cards[1].length);
		if()//player hits hit add card
		{
			
		}
		
	}
	
	//get the dealers first 2 cards
	public void dealerHand()
	{
		
		
		
	}
	
	
	
	
	
	
}//end class

  