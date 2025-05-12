package OOPS;
import java.util.*;

public class Employee {
    public Employee(String email, String name, int salary) {
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    String name;
    String email;
    int salary;
    String company = "TCS";


    void employeeDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Salary: Rs." + this.salary);
        System.out.println("Company: " + company);

    }

    public static void main(String[] args){  //objects of the class will occupy the heap memory
        // heaps can also be called priority queue

        System.out.println();

        Employee e1 = new Employee("test1","test1@gmail.com",80000);
        e1.employeeDetails();
        System.out.println();

        Employee e2 = new Employee("test2","test2@gmail.com",50000);
        e2.employeeDetails();
        System.out.println();

        Employee e3 = new Employee("test1","test3@gmail.com",60000);
        e3.employeeDetails();
        System.out.println();

    }
}
