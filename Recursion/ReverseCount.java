import java.util.*;

class ReverseCount
{
    public static void reverseCount(int n)
    {
        if(n==0)
           return;
        System.out.print(n + " ");
        reverseCount(n-1);
    }

    public static void straightCount(int n)
    {
        if(n==0)
           return;
        straightCount(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Reverse count from " + n + " to 1:");
        reverseCount(n);
        System.out.println(); 
        System.out.println("Straight count from 1 to " + n + ":");
        straightCount(n);
        System.out.println();
    }
}