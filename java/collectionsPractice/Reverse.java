package collectionsPractice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Reverse {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int temp=sc.nextInt();
            arr.add(temp);
        }
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
