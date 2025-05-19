class Array_Zeros_NonZero_Elem
{
    public static void main(String[] args)
    {
        int[] arr={0,-1,0,99,76,0,3};
        int n=arr.length;
        int zeros=0;
        int nonzeros=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==0)
            {
                zeros++;
            }
            else{
                nonzeros++;
            } 
        }
        System.out.println("Zeros: "+zeros);
        System.out.println("Non Zeros: "+nonzeros);
    }
}