// check if avg of your array is same as your middle element of array

class Middle_Element_Array
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int avg = 0;
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }
        avg = sum/n;
        int middle = arr[n/2];
        System.out.println(avg==middle?"Yes":"No");
    }
}