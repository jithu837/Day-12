import java.util.*;
public class AcceptingValuesLinkedList
{
    public static void main(String args[])
    {
        LinkedList<Integer> a=new LinkedList<>();
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        for (int i=0;i<size;i++)
        {
            int s=sc.nextInt();
            a.addFirst(s);
        }
        for (int i=0;i<size;i++)
        System.out.println(a.get(i)+" ");
    }
}
/*5
3 4 5 6 7 
7 
6
5
4
3*/