import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
        populate();
    }

    private void populate(){
        for (Suit suit:Suit.values()) {
            for (Rank rank:Rank.values()) {
             cards.add(new Card(rank, suit));
            }
        }
    }

    public int getSize(){
        return cards.size();
    }

    public Card drawCard(){
        return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
