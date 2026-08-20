package LambdasAndStreams;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Greeting greeting=new HelloGreeting();
        greeting.sayHello();
        Greeting gr=new Greeting() {
            @Override
            public void sayHello(){
                System.out.println("Hello!");
            }
        };
        gr.sayHello();
        Greeting gr2 =() -> System.out.println("He");
        gr2.sayHello();
        Calculator cl = (a,b) -> {return a+b;};
        System.out.println(cl.calculate(4, 3));
        IntBinaryOperator in=(a,b) -> {return a+b;};
        System.out.println(in.applyAsInt(4, 8));
        Employee e1=new Employee("Sahil", "Srivastava");
        Function<Employee,String> f1 = e -> e.getfirstName()+" "+e.getlastName();
        System.out.println(f1.apply(e1));
    }
}
