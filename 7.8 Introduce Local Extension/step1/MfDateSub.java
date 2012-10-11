package step1;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: hyq
 * Date: 10/11/12
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class MfDateSub extends Date {
    public MfDateSub(String dateString) {
        super(dateString);
    }

    public MfDateSub(Date arg) {    //transform constructor
        super(arg.getTime());
    }

    public MfDateSub nextDay(Date arg) {
        return (MfDateSub) new Date(getYear(), getMonth(), getDay() + 1);
    }
}
