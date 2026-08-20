package GenericPractice;

import java.util.*;
import static java.util.Arrays.asList;
public class TicketMachine {
    public static void main(String[] args) {
        List<List<String>> destination=asList(
            asList("New York","Berlin","Boston"),
            asList("Los Angeles","Mayami","potatp")
        );
        List<List<Ticket>> ticketList=asList(
            asList(new AdultTicket(),new AdultTicket()),
            asList(new ChildTicket(), new ChildTicket())
        );
        List<String> Destinations=flattenList(destination);
        System.out.println(Destinations);
        List<Ticket> tickets=flattenList(ticketList);
        System.out.println(tickets);
        System.out.println("Total Price:"+getTotalPrice(tickets));
        List<AdultTicket> adulti=asList(new AdultTicket(),new AdultTicket());
        System.out.println("Total Price:"+getTotalPrice(adulti));

    }
    static <T> List<T> flattenList(List<List<T>> nestedList)
    {
        List<T> flattenedList=new ArrayList<>();
        nestedList.forEach(flattenedList::addAll);
        return flattenedList;
    }
    static int getTotalPrice(List<? extends Ticket> tickets){
        return tickets.stream().map(Ticket::getPrice).reduce(0,Integer::sum);
    }
}
