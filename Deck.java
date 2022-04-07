// package com.hackathon.dekofcards;
// WAR
import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> cards;
	
    public Deck() {
        this.cards = new ArrayList<Card>();

        // Populate the cards list -- loop to 52
        for (String name : new String[] {"Hearts", "Clubs", "Diamonds", "Spades"}) {
            for (Integer rank = 2; rank <= 14; rank++) {
                this.cards.add(new Card(name, rank));
            }
        }
    }

    public void shuffle(){
        System.out.println("Shuffling Deck!");
        ArrayList<Card> shuffledDeck = new ArrayList<Card>();
        Random rand = new Random();

        while(this.cards.size() > 0){
            int idx = rand.nextInt(this.cards.size());
            shuffledDeck.add(cards.remove(idx));
        }

        this.cards = shuffledDeck;
    }

    public ArrayList<Card> deal() {
        Random rand = new Random();
        int numCardsinDeck = this.cards.size();
        int numCards = 0;
        ArrayList<Card> randCards = new ArrayList<Card>();

        if(this.cards.size() == 26){
            return this.cards;
        }

        while(numCards < 26){
            int idx = rand.nextInt(numCardsinDeck);
            if(this.cards.get(idx) != null){
                randCards.add(this.cards.remove(idx));
                numCards++;
                numCardsinDeck--;          
            }
        }

        return randCards;
    }

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
    
}
