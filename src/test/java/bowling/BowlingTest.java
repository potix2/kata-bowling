package bowling;

import bowling.Bowling;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: CH0013
 * Date: 13/02/07
 * Time: 18:15
 * To change this template use File | Settings | File Templates.
 */
public class BowlingTest {

    @Test
    public void testPerfectGame() {
        assertThat(Bowling.calcScore("XXXXXXXXXXXX"), is(300));
    }

    @Test
    public void testNoMarkGame() {
        assertThat(Bowling.calcScore("9-9-9-9-9-9-9-9-9-9-"), is(90));
    }

    @Test
    public void testSpareGame() {
      assertThat(Bowling.calcScore("5/5/5/5/5/5/5/5/5/5/5"), is(150));
    }
}
