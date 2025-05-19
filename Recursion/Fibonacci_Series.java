/*
Fibonacci Series Printing
*/

import java.util.Scanner;
class Fibonacci_Series
{
    static void fibonacci(int n, int first, int second)
    {
        if(n>0)
        {
            System.out.print(first+" ");
            fibonacci(n-1, second, first+second);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibonacci(n,0,1);
    }
}