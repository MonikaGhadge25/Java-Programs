/*Linear search using recursion */

import java.util.Scanner;
public class LinearSearchRecursion {
    static int linearSearch(int arr[], int n, int x) {
        if (n < 0) {
            return -1; // Element not found
        }
        if (arr[n] == x) {
            return n; // Element found
        }
        return linearSearch(arr, n - 1, x); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();
        
        int result = linearSearch(arr, n - 1, x);
        
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        
        sc.close();
    }
}