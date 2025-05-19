/*unique elements in Unsorted array
{10,20,30,30,20,50,60}
Distict: 10,20,30,50,60
Unique: 10,50,60
*/

import java.util.Scanner;
class unique_array_ele
{
    static void findUniqueElement(long[] arr, int size)
    {
        int freq_count;
        boolean flag=false;
        for(int target=0; target<size; target++)
        {
            if(arr[target]==-1)
                continue;
            freq_count=1;
            for(int span=target+1; span<size; span++)
            {
                if(arr[target]==arr[span])
                {
                    freq_count++;
                    arr[span] = -1;
                }
            }
            if(freq_count==1)
            {
                System.out.print(arr[target]+" ");
                flag=true;
            }
        }
        if(flag==false)
            System.out.println("There is no unique elements");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];
        for(int i = 0; i<size; i++)
            arr[i] = sc.nextLong();

        findUniqueElement(arr,size);
    }
}