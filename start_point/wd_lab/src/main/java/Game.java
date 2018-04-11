public class Game {

    private Deck deck;
    private Player player1;
    private Player player2;

    public Game(){
        this.deck = new Deck();
        this.player1 = new Player("player1");
        this.player2 = new Player("player2");
    }

    private Card dealCard() {
        return deck.drawCard();
    }

    private String compareHands() {
        if (player1.showHand() == player2.showHand()) {
            return "Both players are tied";
        } else if (player1.showHand() > player2.showHand()) {
            return String.format("%s has won", player1.getName());
        } else {
            return String.format("%s has won", player2.getName());
        }
    }

    public String playGame() {
        this.deck.shuffle();
        this.player1.receiveCard(dealCard());
        this.player2.receiveCard(dealCard());
        return compareHands();
    }



}
