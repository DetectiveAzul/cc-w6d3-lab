public class Card {

    private Rank rank;
    private Suit suit;


    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public int getValue(){
        return this.rank.getValue();
    }

    public Rank getRank(){
        return this.rank;
    }
}
