/*
write program to count the smart characters in given string consider all characters except alphabets and digit as special characters.
*/

import java.util.Scanner;
class count_special_characters
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();     //123%abD^&ty
        int count=0;

        for(int i=0; i<s.length();i++)    //i=0
        { 
            char ch_temp = s.charAt(i);    //ch_temp='1'
            //way - 1
            // if(ch_temp >='A' && ch_temp<='E')
            //     continue;
            // else if(ch_temp>='a' && ch_temp<='z')
            //     continue;
            // else if(ch_temp>='0' && ch_temp<='9')
            //     continue;
            // else 
            //     count++;

            //way - 2
            if(!(ch_temp>='A' && ch_temp<='E') && !(ch_temp>='a' && ch_temp<='z') && !(ch_temp>='0' && ch_temp<='9'))
                count++;
        }
        System.out.print(count);
    }
}