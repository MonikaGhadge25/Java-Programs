import java.util.Scanner;

public class CheckSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        readArray(arr, 0, sc); // Recursive input

        if (isSorted(arr, 0)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    public static void readArray(int[] arr, int index, Scanner sc) {
        if (index == arr.length) {
            return;
        }
        arr[index] = sc.nextInt();
        readArray(arr, index + 1, sc); // Recursive call
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true; // Base case: end of array
        }
        if (arr[index] > arr[index + 1]) {
            return false; // Not sorted
        }
        return isSorted(arr, index + 1); // Recursive call
    }
}