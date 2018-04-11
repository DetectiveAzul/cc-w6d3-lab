import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card1;
    private Card card2;


    @Before
    public void before(){
        card1 = new Card(Rank.FOUR, Suit.DIAMONDS);
        card2 = new Card(Rank.KING, Suit.HEARTS);

    }

    @Test
    public void hasAValue(){
        assertEquals(4, card1.getValue());
    }

    @Test
    public void hasARank(){
        assertEquals(Rank.KING, card2.getRank());
    }

    @Test
    public void hasASuit(){
        assertEquals(Suit.DIAMONDS, card1.getSuit() );
    }




}
