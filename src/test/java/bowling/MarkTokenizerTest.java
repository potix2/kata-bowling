package bowling;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: CH0013
 * Date: 13/02/07
 * Time: 18:43
 * To change this template use File | Settings | File Templates.
 */
public class MarkTokenizerTest {
    @Test
    public void testTokenize() {
        MarkTokenizer tokenizer = new MarkTokenizer();
        List<Mark> tokens = tokenizer.tokenize("9-");
        assertThat(tokens.get(0), is(Mark.NINE));
        assertThat(tokens.get(1), is(Mark.GARTER));
    }
}
