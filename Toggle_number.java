//write the code for toggle the nth hit of a number

import java.util.Scanner;
class Toggle_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the position to toggle");
        int pos = sc.nextInt();
        int mask = 1 << (pos - 1);
        int result = n ^ mask;
        System.out.println("The number after toggling is: " + result);
    }
}