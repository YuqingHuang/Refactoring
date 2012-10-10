package step1;

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

    //Create_a_new_method_to_get_delegated_object
    public Department getDepartment() {
        return _department;
    }
}
