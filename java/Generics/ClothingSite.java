package Generics;
import java.util.*;
public class ClothingSite {
    public static void main(String[] args) {
        ShirtItem shirt=new ShirtItem();
        ShirtItem shirt2=new ShirtItem();
        JacketItem jacket=new JacketItem();
        checkOutItem(jacket);
        checkOutItem(shirt);
        List<ClothingItem> li=new ArrayList<>();
        li.add(shirt);
        li.add(jacket);
        checkOutItem(li);
        List<ShirtItem> le=new ArrayList<>();
        le.add(shirt);
        le.add(shirt2);
        checkOutItemAnySubType(le);//here the type is not same so we create another
    }
    static void checkOutItem(ClothingItem item){
        System.out.println("Item purchased:"+item.getName()+"\nPrice:"+item.getPrice());
    }
    static void checkOutItem(List<ClothingItem> cloth)
    {
        for(ClothingItem item:cloth)
        {
            checkOutItem(item);
        }
    }
    static void checkOutItemAnySubType(List<? extends ClothingItem> cloth){//wildcard
        for(ClothingItem item:cloth){
            checkOutItem(item);
        }
    }

}
