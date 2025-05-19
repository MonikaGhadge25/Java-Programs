/*
write program to accept string and perform reverse only on alphabbetic characters in the string
*/

import java.util.Scanner;
class reverse_char
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int left=0;
        int right=str.length()-1;

        char[] str_arr = str.toCharArray();

        while(left<right)
        {
            while(left<right && !(str_arr[left]>='a' && str_arr[left]<='z') && !(str_arr[left]>='A' && str_arr[left]<='Z'))
                left++;
            while(left<right && !(str_arr[right]>='a' && str_arr[right]<='z') && !(str_arr[left]>='A' && str_arr[left]<='Z'))
                right--;

            if(left<right)
            {
                char temp=str_arr[left];
                str_arr[left] = str_arr[right];
                str_arr[right] = temp;
                left++;
                right--;
            }
        }
        String res = new String(str_arr);
        System.out.println(res);
    }
}