//write code to clear Nth bit of a number

import java.util.Scanner;
class ClearNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position of the bit to clear:");
        int pos = sc.nextInt();

        // Clear the Nth bit
        int mask = ~(1 << pos);
        int result = n & mask;

        System.out.println("Number after clearing " + pos + "th bit: " + result);
    }
}