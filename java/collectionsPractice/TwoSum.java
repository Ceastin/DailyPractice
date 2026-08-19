package collectionsPractice;
import java.util.*;
public class TwoSum {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int temp=sc.nextInt();
            arr[i]=temp;
        }
        int sum=sc.nextInt();
        HashMap<Integer,Integer> mp=new HashMap<>();
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>sum)
                continue;
            if(mp.containsKey(sum-arr[i]))
            {
                System.out.println(mp.get(sum-arr[i])+" "+i);
                flag=true;
                break;
            }
            mp.put(arr[i],i);
        }
        if(flag==false)
            System.out.println("Not found");
    }
}
