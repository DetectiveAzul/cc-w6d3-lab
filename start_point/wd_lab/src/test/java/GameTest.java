import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game1;

    @Before
    public void before(){
        game1 = new Game( );
    }


    @Test
    public void canPlay(){
        //This test only works half of the time due to shuffling
        assertEquals("player1 has won", game1.playGame());
    }
}
