import java.util.Scanner;
class mountain_arr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int ind=0; ind<size; ind++)
            arr[ind]=sc.nextInt();
        int climb=0;
        boolean isValid=true;
        if(size<3)
            isValid=true;
        else
        {
            while(climb+1<size && arr[climb] < arr[climb+1])
            {
                climb++;
            }
            if(climb==0 || climb==size-1)
            {
                isValid=false;
            }
            int down=climb;
            while(down+1<size && arr[down] > arr[down+1])
            {
                down++;
            }
            if(down==size-1)
                isValid=true;
            else
                isValid=false;
        }
        if(isValid)
            System.out.println("valid mountain array");
        else
            System.out.println("Invalid mountain array");
    }
}