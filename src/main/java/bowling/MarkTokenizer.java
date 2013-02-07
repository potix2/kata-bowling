package bowling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: CH0013
 * Date: 13/02/07
 * Time: 18:46
 * To change this template use File | Settings | File Templates.
 */
public class MarkTokenizer {
    public List<Mark> tokenize(String s) {
        List<Mark> list = new ArrayList<Mark>();
        for (char c: s.toCharArray()) {
            list.add(Mark.valueOf(c));
        }
        return list;  //To change body of created methods use File | Settings | File Templates.

    }
}
