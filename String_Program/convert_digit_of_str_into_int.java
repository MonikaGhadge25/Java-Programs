/*
write progrma to read a string and convert digit of a string into integer number
sample input: hit12hello13
sample output: 1213
*/

import java.util.Scanner;
class convert_digit_of_str_into_int
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();      //we134com56e
        int sum = 0;

        for(int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9')
                sum = (sum*10) + ch - '0';
        }
        System.out.println(sum);

    }
}