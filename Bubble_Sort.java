/*
Sorting
1.Bubble SOrt: comparing and swaping adjacent element if(curr > curr+1) then swap
*/

class Bubble_Sort
{
    public static void main(String[] args)
    {
        int[] arr = {1,5,3,2,4};
        int n=arr.length;
        for(int i=0; i<n; i++)//iteration till sorted
        {
            for(int j=0; j<n-1; j++)//used for comparison and swapping
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}