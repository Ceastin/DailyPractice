package Generics;
import java.util.*;
public class method1 {
    public static void main(String[] args) {
        String []words={"Apple","Mango","Banana"};
        Integer[] numbers={1,2,4,5,6};
        Double[] doNum={1.3,2.0,23.1,21.0};
        List<Integer> nu=convertArray(numbers);
        List<String> st=convertArray(words);
        List<Integer> nu1=StrictConvert(numbers);
        List<Double> st1=StrictConvert(doNum);
        System.out.println(nu);
        System.out.println(st);

        System.out.println(nu1);
        System.out.println(st1);
    }
    private static <T> List<T> convertArray(T[] array){
        return Arrays.asList(array);
    }
    private static <T extends Number> List<T> StrictConvert(T[] array){
        return Arrays.asList(array);
    }
}
