import java.util.ArrayList;
import java.util.*;

public class Player {

    //Member Variables
    private String name;
    private ArrayList<Card> hand;
    private ArrayList<Card> won;
    private static int playerCount = 0;


    //Constructor
    public Player(){
        System.out.println("Please enter your name:");
        this.name = System.console().readLine();
        this.hand = new ArrayList<Card>();
        this.won = new ArrayList<Card>();
        this.playerCount++;
    }
    

    //METHODS
    public void showHand() {
        for (Card card: getHand()) {
		    card.showCard();
		}
    }

    public void showWon() {
        for (Card card: getWon()) {
		    card.showCard();
		}
    }

    public int wonSize() {
        return this.won.size();
    }

    public Card firstHand() {
        return this.hand.remove(0);
    }

    public void addToWon(Card card1, Card card2) {
        this.won.add(card1);
        this.won.add(card2);
    }

    // Getters & Setters
    public int getPlayerCount(){
        return this.playerCount;
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }
    
    public ArrayList<Card> getWon(){
        return this.won;
    }

    public String getName(){
        return this.name;
    }

    public void setHand(ArrayList<Card> hand){
        this.hand = hand;
    }

    public void setWon(ArrayList<Card> won){
        this.won = won;
    }
}
