/*
write program to accept string and perform reveres only on Alphabetic characters do in place reverse
sample input: $%^&&**&
sampke output: $%^&&**&
*/


import java.util.Scanner;
class reverse_only_alphabetic_char
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int left=0;
        int right=str.length()-1;

        //converting string to character array
        char[] str_arr = str.toCharArray();
        
        while(left<right)
        {
            char temp = str_arr[left];
            str_arr[left] = str_arr[right];
            str_arr[right] = temp;
            left++;
            right--;
        }
        String res = new String(str_arr);
        System.out.println(res);
    }
}