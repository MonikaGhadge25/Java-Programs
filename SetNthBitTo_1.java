//write code to change Nth bit to 1
public class SetNthBitTo_1 {
    public static void main(String[] args) {
        int number = 10; // Example number
        int n = 2; // Bit position to set (0-indexed)

        int result = setNthBit(number, n);
        System.out.println("Number after setting " + n + "th bit: " + result);
    }

    public static int setNthBit(int number, int n) {
        return number | (1 << n);
    }
}