package Assignment_01;
import java.util.*;

public class Q6
{
    int sum(int a, int b)
    {
        return a+b;
    }
    int sub(int a, int b)
    {
        if(a-b < 0)
        {
            return 0;
        }
        else
        {
            return(a-b);
        }
    }
    public static void main (String [] args)
    {
        System.out.println("Name : Ragini Singh");
        Scanner sc = new Scanner (System.in);
        Q6 obj = new Q6();
        System.out.print("Enter the value of integer a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of integer b : ");
        int b = sc.nextInt();
        int result = (a>b)?obj.sum(a, b):obj.sub(a, b);
        System.out.println("Result after ternary operation is : " + result);
    }    
}