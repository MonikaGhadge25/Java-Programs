/* factorial number */

import java.util.Scanner;
class factorial_of_num
{
        static int factorial(int n)
        {
            if(n==0 || n==1)
                return 1;
            else
                return n * factorial(n-1);
        }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = factorial(n);
        System.out.println("Factorial of number = "+res);
    }
}