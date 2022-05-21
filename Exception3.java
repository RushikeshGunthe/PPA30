import java.lang.*;
import java.util.*;

class Exceptin3
{
    public static void main(String arg[])
    {
        int Arr[] = {10,20,30,40,50};
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the index");
        int index = sobj.nextInt();

        System.out.println("Element at that index is : "+Arr[index]);
    }
}
