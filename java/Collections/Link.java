package Collections;
import java.util.*;
public class Link {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Hit There");
        ll.add("Sue There");
        System.out.println(ll);
        ll.pop();
        ll.pop();
        System.out.println(ll.poll());
        System.out.println(ll.pop());
    }
}
