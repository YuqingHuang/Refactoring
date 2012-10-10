package before;

/**
 * Created with IntelliJ IDEA.
 * User: hyq
 * Date: 10/10/12
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    Department _department;

    public Person getManager() {
        return _department.get_manager();
    }

}
