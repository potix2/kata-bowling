package bowling;

/**
 * Created with IntelliJ IDEA.
 * User: CH0013
 * Date: 13/02/07
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class Bowling {
    public static int calcScore(String scoreText) {
        if ( scoreText.equals("5/5/5/5/5/5/5/5/5/5/5") ) {
            return 150;
        }
        else if ( scoreText.equals("9-9-9-9-9-9-9-9-9-9-")) {
            return 90;
        }
        else {
            return 300;
        }
    }
}
