package bowling;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: CH0013
 * Date: 13/02/07
 * Time: 18:31
 * To change this template use File | Settings | File Templates.
 */
public class MarkTest {
    @Test
    public void testGetToken() {
       assertThat(Mark.valueOf('-'), is(Mark.GARTER));
       assertThat(Mark.valueOf('9'), is(Mark.NINE));
    }

}
