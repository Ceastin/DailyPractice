package collectionsPractice;
import java.util.*;
public class Occurence
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String word=sc.next();
        s=s.replaceAll("\\.", "");
        System.out.println(Arrays.stream(s.split(" ")).filter(w -> w.equalsIgnoreCase(word)).count());
    }
}