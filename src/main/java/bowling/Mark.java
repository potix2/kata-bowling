package bowling;

/**
 * Created with IntelliJ IDEA.
 * User: CH0013
 * Date: 13/02/07
 * Time: 18:36
 * To change this template use File | Settings | File Templates.
 */
public enum Mark {
    GARTER,
    NINE;

    public static Mark valueOf(char token) {
        if (token == '9') {
            return NINE;
        }
        return GARTER;
    }
}
