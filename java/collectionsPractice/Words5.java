package collectionsPractice;
import java.util.*;
import java.util.stream.Collectors;
public class Words5 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Arrays.stream(s.split(" ")).filter(w -> w.length()<=5).count());
        System.out.println(Arrays.stream(s.split(" ")).filter(w -> w.length()<=5).sorted().collect(Collectors.toList()));
    }
}
