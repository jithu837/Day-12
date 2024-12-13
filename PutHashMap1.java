import java.util.*;
public class PutHashMap1{
    public static void main(String args[])
    {
        HashMap<String,String> a= new HashMap<>();
        a.put("SNO","01");
        a.put("SName","Muraja");
        System.out.println(a);
        if(a.containskey("SName"))
        {
            String d=a.get("SName");
            System.out.println(d);
        }
    }
}