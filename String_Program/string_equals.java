/*
write program to take two string as user input and check it both are equals or not
*/

import java.util.Scanner;
class string_equals
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.next();

        if(str1.equals(str2))
            System.out.println("Equals");
        else 
            System.out.println("Not Equals");
    }
}