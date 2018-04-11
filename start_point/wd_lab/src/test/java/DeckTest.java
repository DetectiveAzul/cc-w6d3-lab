import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    private Deck deck1;
    private Card card1;
    private Card card2;

    @Before
    public void before(){
        deck1 = new Deck();
        card1 = new Card(Rank.KING, Suit.HEARTS);
        card2 = new Card(Rank.TWO, Suit.HEARTS);
    }

    @Test
    public void getDeckSize(){
        assertEquals(52, deck1.getSize());
    }

    @Test
    public void canDraw() {
        Card cardDrawn = deck1.drawCard();
        assertEquals( card1.getClass(),cardDrawn.getClass());
        assertEquals(51, deck1.getSize() );
    }

    @Test
    public void canShuffle() {
        deck1.shuffle();
        assertNotEquals(card2.getRank(), deck1.drawCard());
    }
}
