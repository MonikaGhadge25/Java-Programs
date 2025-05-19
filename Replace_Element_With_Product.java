/*
Ip:1 2 3 4 5
OP:120 60 40 30 24
Replace Each element with the product of all remaining elements
*/
import java.util.Arrays;
class Replace_Element_With_Product
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int prod=1;
        for(int i=0; i<arr.length; i++)
        {
            prod=prod*arr[i];
        }
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = prod/arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}