// Find last occurrence of a target element in an array using recursion

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
         // number
        int n = sc.nextInt(); // number of elements
        System.out.println("Enter the elements of the array:");
         // input elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter the element to search: ");
         // target element
        int target = sc.nextInt(); // target element
        int idx = find(arr, 0, target);
        
        System.out.println(idx);
    }

    static int find(int[] arr, int i, int target) {
        if (i == arr.length) return -1; // not found
        int res = find(arr, i + 1, target); // check next
        if (res != -1) return res; // found in the rest
        if (arr[i] == target) return i; // found at current index
        return -1; // not found
    }
}