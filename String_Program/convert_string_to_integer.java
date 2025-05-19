/*String to integer
problem: write a program to accept the string and convert that into the integer
*/

import java.util.Scanner;
class convert_string_to_integer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum=0;
        for(int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            sum = (sum*10) + ch - '0';
        }
        System.out.println(sum);
    }
}