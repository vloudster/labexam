package ie.test;

import ie.employee.Employee;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {


    @Test
    public void testTitle(){
        Employee employee = new Employee("Mrs", "Vladimir", "1234345", 1234567, "Full-time" , 26);
        assertEquals(employee.getTitle(), "Mrs");
    }
    public void testName(){
        Employee employee = new Employee("Mrs", "Vladimir", "1234345", 1234567, "Full-time" , 26);
        assertEquals(employee.getName(), "Vladimir");
    }
    public void testPPS(){
        Employee employee = new Employee("Mrs", "Vladimir", "1234345", 1234567, "Full-time" , 26);
        assertEquals(employee.getPpsId(), "1234345");
    }
    public void phoneNumber(){
        Employee employee = new Employee("Mrs", "Vladimir", "1234345", 1234567, "Full-time" , 26);
        assertEquals(employee.getPhoneNumber(), 1234567);
    }
    public void testEmployment(){
        Employee employee = new Employee("Mrs", "Vladimir", "1234345", 1234567, "Full-time" , 26);
        assertEquals(employee.getEmploymentType(), "Full-time");
    }
    public void testAge(){
        Employee employee = new Employee("Mrs", "Vladimir", "1234345", 1234567, "Full-time" , 26);
        assertEquals(employee.getEmploymentType(), 26);
    }

}
