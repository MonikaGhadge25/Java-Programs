//count digit in numeber using recursion
class Count_digit
{
    static int countDigits(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: divide n by 10 and add 1 for the current digit
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345; // Example number
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);
    }
}