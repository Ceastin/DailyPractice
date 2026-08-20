package LambdasAndStreams;

public class Employee {
    private String firstName;
    private String lastName;
    Employee(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    String getfirstName()
    {
        return firstName;
    }
    String getlastName(){
        return lastName;
    }
}
