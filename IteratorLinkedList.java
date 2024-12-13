//printing values using iterator
import java.util.*;
public class IteratorLinkedList {
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("vinay");
        a.add("students");
        //printer using iterator
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
    
}