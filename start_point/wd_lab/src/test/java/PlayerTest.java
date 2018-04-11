import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    private Player player1;
    private Card card1;

    @Before
    public void before() {
        player1 = new Player("Player 1");
        card1 = new Card(Rank.KING, Suit.HEARTS);
    }

    @Test
    public void hasName() {
        assertEquals("Player 1", player1.getName());
    }
    @Test
    public void canAddCards() {
        player1.receiveCard(card1);
        assertEquals(1, player1.getSize());
    }

    @Test
    public void canClearHand() {
        player1.receiveCard(card1);
        player1.receiveCard(card1);
        player1.receiveCard(card1);
        assertEquals(3, player1.getSize());
        player1.clearHand();
        assertEquals(0, player1.getSize());
    }

    @Test
    public void canShowHand() {
        player1.receiveCard(card1);
        assertEquals(13, player1.showHand());
    }
}
