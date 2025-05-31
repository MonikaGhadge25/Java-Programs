/*Binary search using recursion without using while and fore loop*/

import java.util.Scanner;
public class BinarySearchRecusrion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        
        int result = binarySearch(arr, target, 0, n - 1);
        
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        
        scanner.close();
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Element not found
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid; // Element found
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1); // Search in the left half
        } else {
            return binarySearch(arr, target, mid + 1, right); // Search in the right half
        }
    }
}