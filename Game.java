public class Game {
    private Deck myDeck;
    private Player p1;
    private Player p2;
    private boolean continueGame = true;

    public void startGame() {
        myDeck = new Deck();
        myDeck.shuffle();
		p1 = new Player();
        p1.setHand(myDeck.deal());
		p2 = new Player();
        p2.setHand(myDeck.deal());

        while(continueGame) {
            this.flip();
            System.out.println(p1.getName() + " has " + p1.wonSize() + " points");
            System.out.println(p2.getName() + " has " + p2.wonSize() + " points");
            
            if(p1.wonSize() >= 10) {
                continueGame = false;
                System.out.println("WINNER ---------> " + p1.getName() + " <--------- WINNER");
                break;
            }
            if(p2.wonSize() >= 10) {
                continueGame = false;
                System.out.println("WINNER ---------> " + p2.getName() + " <--------- WINNER");
                break;
            }

            System.out.println("PRESS ENTER TO PLAY NEXT ROUND");
            System.console().readLine();
        }
    }

    // compares "top card" vs players
    public void flip() {
        System.out.println("-------- FLIP --------");
        Card p1Card = p1.firstHand();
        System.out.println(p1.getName() + "'s card is: ");
        p1Card.showCard();
        p1Card.printCard(p1Card);
        Card p2Card = p2.firstHand();
        System.out.println(p2.getName() + "'s card is: ");
        p2Card.showCard();
        p2Card.printCard(p2Card);
        if(p1Card.getRank() > p2Card.getRank()){
            System.out.println(p1.getName() + " won the round.");
            System.out.println("-------------------------");
            p1.addToWon(p1Card, p2Card);
        } else if (p2Card.getRank() > p1Card.getRank()){
            System.out.println(p2.getName() + " won the round.");
            System.out.println("-------------------------");
            p2.addToWon(p1Card, p2Card);
        } else {
            System.out.println("Draw");
            System.out.println("-------------------------");
        }
    }
}