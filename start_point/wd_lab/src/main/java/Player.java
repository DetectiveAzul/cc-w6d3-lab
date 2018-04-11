import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void receiveCard(Card card){
        hand.add(card);
    }

    public void clearHand(){
        hand.clear();
    }

    public int getSize(){
        return hand.size();
    }

    public int showHand() {
        return hand.get(0).getValue();
    }

    public Card getCard() {
        return hand.get(0);
    }

}
