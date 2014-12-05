//Blackjack.java
import java.util.*;

public class Cards 
{	
	//Create a list of all the cards
	LinkedList cards = new LinkedList();
	String [] deck;
	
	cards.add("Two");
	cards.add("Three");
	cards.add("Four");
	cards.add("Five");
	cards.add("Six");
	cards.add("Seven");
	cards.add("Eight");
	cards.add("Nine");
	cards.add("Ten");
	cards.add("Jack");
	cards.add("Queen");
	cards.add("King");
	cards.add("Ace");
	
	
	//different type of cards
	LinkedList suits = new LinkedList();
	
	suits.add("Clubs");
	suits.add("Hearts");
	suits.add("Spades");
	suits.add("Diamonds");

	public void createDeck()
	{
		for(int i = 0; i<cards.length; i++)
			{
				for(int o=0;i<suits;o++)
				{
					
					deck.
				}
			}

	}//end create deck

	public String toString()
	{
		return 	getList() + " of "+ suits;
	}//end toString
	
}//end class

  //linkedList.remove() , linkedList.add(), linkedList.removeFirst(),
  //linkedList.removeLast();, linkedList.set();