package collectionsPractice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Avg {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //ArrayList<Integer> arr=new ArrayList<>();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int temp=sc.nextInt();
            arr[i]=temp;
            //arr.add(temp);
        }
        //System.out.println(arr.stream().reduce(0,Integer::sum)/(double)arr.size());
        System.out.println(Arrays.stream(arr).reduce(0,Integer::sum)/(double)n);
    }
}