class Min_Max_Element_Array
{
    public static void main(String[] args)
    {
        int[] arr={1,4,3,2,5};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max) max=arr[i];

            if(arr[i]<min) min=arr[i];
        }
        System.out.println("Min Value:"+ min);
        System.out.println("Max Value:"+ max);
    }  
}