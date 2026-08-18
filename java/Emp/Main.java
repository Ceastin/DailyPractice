package Emp;

public class Main {
    public static void main(String[] args)
    {
        Employee emp1=new Employee("sahil","siliguri",30000,23);
        Employee emp2=new Employee("Aftab","Pune",28000,23);
        emp1.raiseSalary();
        System.out.println(emp1.salary);
        System.out.println(emp2.salary);
    }
}
