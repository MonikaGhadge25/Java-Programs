class Array_display_element_diff
{
    public static void main(String[] args)
    {
        int arr[] ={1,2,3,4,5};
        int n=arr.length;
        for(int i=0; i<n-1;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println(arr[n-1]);
    }
}