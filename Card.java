// package com.hackathon.dekofcards;

import java.util.HashMap;

public class Card {
	
	private String suit;
	private int rank;
	private String name;
	
    public Card(String suit, Integer rank) {
    	this.suit = suit;
    	this.rank = rank;
    	this.name = "";
    	
    	HashMap<Integer, String> names = new HashMap<Integer, String>();
        names.put(11, "Jack");
        names.put(12, "Queen");
        names.put(13, "King");
		names.put(14, "Ace");
            
            
        if (names.get(rank) != null) {
            this.name = names.get(rank);
        }
        else {
            this.name = Integer.toString(rank);
        }
    }

	public void printCard(Card card){
		System.out.println("┌─────────┐");
		if(card.rank < 10) {
		  System.out.printf("│%d        │", card.rank);
		}
		else if(card.rank == 10){
		  System.out.printf("│%s       │", "10");
		  }
		else if(card.rank == 11){
		  System.out.printf("│%s        │", "J");
		  }
		else if(card.rank == 12){
		  System.out.printf("│%s        │", "Q");
		  }  
		else if(card.rank == 13){
		  System.out.printf("│%s        │", "K");
		  }  
		else if(card.rank == 14){
		  System.out.printf("│%s        │", "A");
		  }   
		System.out.printf("\n│         │");
		System.out.printf("\n│         |");
		if(card.suit == "Clubs") {
		  System.out.printf("\n│    %c    │", '\u2663');
		}
		else if(card.suit == "Diamonds") {
		  System.out.printf("\n│    %c    │", '\u2666');    
		}
		else if(card.suit == "Hearts") {
		  System.out.printf("\n│    %c    │", '\u2665');
		}
		else {
		  System.out.printf("\n│    %c    │", '\u2660');         
		}
		System.out.println("\n│         │");
		System.out.println("│         │");
		if(card.rank < 10) {	
		  System.out.printf("│        %d│", card.rank);
		}
		else if(card.rank == 10){
		  System.out.printf("│       %s│", "10");
		  }
		else if(card.rank == 11) {	
		  System.out.printf("│        %s│", "J");
		}
		else if(card.rank == 12) {
		  System.out.printf("│        %s│", "Q");  
		}
		else if(card.rank == 13) {	
		  System.out.printf("│        %s│", "K");  
		}
		else if(card.rank == 14) {
		  System.out.printf("│        %s│", "A");   
		}
		System.out.println("\n└─────────┘");            
	}

	
	// public void printCard(){
	// 	int unicodeStartNameValue = 0xF0A1;
	// 	String uc = "\\u1";
	// 	if(this.getSuit().equals("Spades")){
	// 		if(this.getRank() < 11){
	// 			unicodeStartNameValue = 0XF0A0 + this.getRank();
	// 		} else if (this.getRank() == 11){
	// 			unicodeStartNameValue = 0XF0AA;
	// 		} else if (this.getRank() == 12){
	// 			unicodeStartNameValue = 0XF0AB;
	// 		} else if (this.getRank() == 13){
	// 			unicodeStartNameValue = 0XF0AC;
	// 		} else if (this.getRank() == 14){
	// 			unicodeStartNameValue = 0XF0A1;
	// 		}
	// 	}
	// 	if(this.getSuit().equals("Hearts")){
	// 		if(this.getRank() < 11){
	// 			unicodeStartNameValue = 0XF0B0 + this.getRank();
	// 		} else if (this.getRank() == 11){
	// 			unicodeStartNameValue = 0XF0BA;
	// 		} else if (this.getRank() == 12){
	// 			unicodeStartNameValue = 0XF0BB;
	// 		} else if (this.getRank() == 13){
	// 			unicodeStartNameValue = 0XF0BC;
	// 		} else if (this.getRank() == 14){
	// 			unicodeStartNameValue = 0XF0B1;
	// 		}
	// 	}
	// 	if(this.getSuit().equals("Diamonds")){
	// 		if(this.getRank() < 11){
	// 			unicodeStartNameValue = 0XF0C0 + this.getRank();
	// 		} else if (this.getRank() == 11){
	// 			unicodeStartNameValue = 0XF0CA;
	// 		} else if (this.getRank() == 12){
	// 			unicodeStartNameValue = 0XF0CB;
	// 		} else if (this.getRank() == 13){
	// 			unicodeStartNameValue = 0XF0CC;
	// 		} else if (this.getRank() == 14){
	// 			unicodeStartNameValue = 0XF0C1;
	// 		}
	// 	}
	// 	if(this.getSuit().equals("Clubs")){
	// 		if(this.getRank() < 11){
	// 			unicodeStartNameValue = 0XF0D0 + this.getRank();
	// 		} else if (this.getRank() == 11){
	// 			unicodeStartNameValue = 0XF0DA;
	// 		} else if (this.getRank() == 12){
	// 			unicodeStartNameValue = 0XF0DB;
	// 		} else if (this.getRank() == 13){
	// 			unicodeStartNameValue = 0XF0DC;
	// 		} else if (this.getRank() == 14){
	// 			unicodeStartNameValue = 0XF0D1;
	// 		}
	// 	}
	// 	uc += Character.toChars((int)unicodeStartNameValue);
	// 	System.out.println(uc);
	// }   
    
    public void showCard() {
        System.out.printf("%s of %s\n", this.name, this.suit);
    }


	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
    
}
