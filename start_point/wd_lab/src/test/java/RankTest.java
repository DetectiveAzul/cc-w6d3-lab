import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RankTest {

    @Test
    public void hasAValue(){
        assertEquals(14, Rank.ACE.getValue());
    }
}
