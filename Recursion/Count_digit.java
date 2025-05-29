//count digit in numeber using recursion

import java.util.Scanner;
class Count_digit
{
    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt(); 
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);
    }
}