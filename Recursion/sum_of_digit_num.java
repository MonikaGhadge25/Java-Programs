/*
sum of digits of a number
*/

import java.util.Scanner;
class sum_of_digit_num
{
    static int sumOfDigit(int num, int sum)
    {
        while(num!=0)
        {
            sum = sum + (num % 10);
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        int res = sumOfDigit(num,sum);

        System.out.println("Sum of Digit = "+res);
    }
}