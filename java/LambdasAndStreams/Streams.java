package LambdasAndStreams;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Streams {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,2,4,5,6,7};
        Stream<Integer> st=Arrays.stream(arr);
        int []ar1=new int[]{23,23,42,12,54};
        IntStream ar3=Arrays.stream(ar1);
        List<Integer> ls1=new ArrayList<>();
        ls1.add(4);
        ls1.add(8);
        ls1.add(3);
        ls1.add(32);
        ls1.add(3);
        Stream<Integer> st2=ls1.stream();
        st2.sorted().forEach(a -> System.out.println(a));
        ArrayList<String> name=new ArrayList<>();
        name.add("aryan");
        name.add("shravan");
        name.add("raman");
        name.add("phillor");
        name.add("arvind");
        name.stream().map(a -> a.toUpperCase().substring(1)).filter(a -> a.length()<=5).sorted().forEach(a -> System.out.println(a));
        List<String> Manp=name.stream().map(a -> a.toUpperCase().substring(1)).filter(a -> a.length()<=5).sorted().collect(Collectors.toList());
        System.out.println(Manp);
        Stream<String> swe=Stream.of("a","B","c");
    }
}
