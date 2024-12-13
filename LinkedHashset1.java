import java.util.*;
public class LinkedHashset1 {
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("jithu");
        a.add("students");
        System.out.println(a);
        a.remove("jithu");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
    
}