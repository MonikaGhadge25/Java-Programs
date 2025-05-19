/* Pairs INPUT: 1 2 3 4 5
Target=5

*/

class Pairs
{
    public static void main(String[] args)
    {
        int[] arr= {1,2,3,4,5};
        int n=arr.length;
        int target=7;

        for(int i=0; i<n;i++)//slow
        {
            for(int j=i+1; j<n; j++)//fast
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }

}