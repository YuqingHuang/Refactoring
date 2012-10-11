package step1;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: hyq
 * Date: 10/11/12
 * Time: 10:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MfDateWrap {
    private Date _original;

    public MfDateWrap(String dateString) {
        _original = new Date(dateString);
    }

    public MfDateWrap(Date arg) {
        _original = arg;
    }

    public int getYear() {
        return _original.getYear();
    }

    public int getMonth() {
        return _original.getMonth();
    }

    public int getDay() {
        return _original.getDay();
    }

    Date nextDay() {
        return new Date(getYear(), getMonth(), getDay() + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MfDateWrap that = (MfDateWrap) o;

        if (_original != null ? !_original.equals(that._original) : that._original != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return _original != null ? _original.hashCode() : 0;
    }
}
