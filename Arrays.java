/*
print the elements of array from right to left 
*/

import java.util.Scanner;
class Arrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]%2!=0)//to print the odd element of array
            {
                System.out.print(arr[i]+" ");
            }
        }
        
        // arr[n-1]=99;
        // for(int i=n-1; i>=0 ; i--) //to print the reverse element of array
        // {
        //     System.out.print(arr[i]+" ");
        // }
    }
}