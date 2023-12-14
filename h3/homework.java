import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String dob;

    public Person() {
    }

    public Person(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private int employeeId;
    private String department;
    private transient int securityClearance;

    public Employee() {
 
    }

    public Employee(String firstName, String lastName, String dob, int employeeId, String department, int securityClearance) {
        super(firstName, lastName, dob);
        this.employeeId = employeeId;
        this.department = department;
        this.securityClearance = securityClearance;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSecurityClearance() {
        return securityClearance;
    }

    public void setSecurityClearance(int securityClearance) {
        this.securityClearance = securityClearance;
    }
}
import java.io.*;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setDob("1990-01-01");
        employee.setEmployeeId(123);
        employee.setDepartment("IT");
        employee.setSecurityClearance(5);

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("DOB: " + employee.getDob());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Security Clearance: " + employee.getSecurityClearance());

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employees.txt"))) {
            oos.writeObject(employee);
            System.out.println("Serialization completed. Object written to Employees.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employees.txt"))) {
            Employee deserializedEmployee = (Employee) ois.readObject();

            System.out.println("\nDeserialized Employee Details:");
            System.out.println("Name: " + deserializedEmployee.getFirstName() + " " + deserializedEmployee.getLastName());
            System.out.println("DOB: " + deserializedEmployee.getDob());
            System.out.println("Employee ID: " + deserializedEmployee.getEmployeeId());
            System.out.println("Department: " + deserializedEmployee.getDepartment());
            System.out.println("Security Clearance: " + deserializedEmployee.getSecurityClearance());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
