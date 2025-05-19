/*
Sqapping of array elements at two positions
*/
import java.util.Scanner;
class swap_ele_two_position
{

    static void swap_ele_two_pos(long[] arr, int pos1, int pos2,int size)
    {
        if(pos1<0 || pos1>size-1 || pos2<0 || pos2>size-1)
        {
            System.out.println("Invalid");
            System.exit(size);
        }
        else   //valid
        {
            long temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;
        }
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];

        for(int ind=0; ind<size; ind++)
            arr[ind] = sc.nextLong();

        int pos1=sc.nextInt();
        int pos2=sc.nextInt();

        swap_ele_two_pos(arr, pos1, pos2, size);
            System.out.println("Updated array after swapping");

            for(long val : arr)
                System.out.print(val+" ");
    }
}