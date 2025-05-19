/*
Array Right Rotation
Method:1) Brute Force: time complexity:O(N)
sudo code:
k=k%size;
for(nuoRot=0;noRot<k;noRot++)
{
    last_ele=arr[size-1]
    for(ind=size-1;ind>=1;i--)
    {
        arr[ind]=arr[ind-1];
    }
    arr[0]=last_ele
}
2)Optimized Method: time compplexity: 
step1: optimized the rotation (ee., k=k%size)
step2: reverse the entire array(from index 0 to size-1)
step3: reverse the first half of the array (from 0 to k-1)
step4: reverse the second half of the array(from k to size-1)
*/


// import java.util.Scanner;
// class Array_Right_Rotation_Ele
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         for(int ind=0;ind<size;ind++)
//             arr[ind] = sc.nextInt();

//         int k = sc.nextInt();
//         k=k%size;

//         for(int noRot=0; noRot<k; noRot++)  //using brute force
//         {
//             int last_ele = arr[size-1];
//             for(int ind=size-1; ind>=1; ind--)
//             {
//                 arr[ind]=arr[ind-1];
//             }
//             arr[0]=last_ele;
//         }

//         for(int ind=0; ind<size;ind++)
//             System.out.print(arr[ind]+" ");
//     }
// }

import java.util.Scanner;
class Array_Right_Rotation_Ele
{
    static void reverse(long[] arr, int left, int right)
    {
        while(left<right)
        {
            long temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void rotateRight(long[] arr, int size, int k)
    {
        k=k%size;
        reverse(arr, 0, size-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, size-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];

        for(int ind=0; ind<size; ind++)
            arr[ind] = sc.nextLong();

        int k = sc.nextInt();

        rotateRight(arr,size,k);
        System.out.print("The right rotated array is: ");

        for(long val : arr)
            System.out.print(val+" ");

    }
}