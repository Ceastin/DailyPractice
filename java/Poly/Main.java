package Poly;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Contact cn1=new Contact("Sally", new PhoneNumber("2637263737"));
        Contact cn2=new Contact("ally", new PhoneNumber(41,"2637263737"));
        Contact cn3=new Contact("Rupally", new PhoneNumber("8887263737"));
        Contact cn4=new Contact("Molly", "ceastinstark@gmail.com");
        Contact []arr={cn1,cn2,cn3,cn4};
        Arrays.stream(arr).forEach((cn)->{System.out.println(cn);});
    }
}
