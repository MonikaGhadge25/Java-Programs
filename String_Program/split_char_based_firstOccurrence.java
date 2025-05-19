/*
write program to split the given input string based on the first occurence of the given input Character
smaple input: 
runner
n
output:
run
ner
*/

import java.util.Scanner;
class split_char_based_firstOccurrence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char split_char = sc.next().charAt(0);
        /*Way - 1*/
        int index = -1;
        for(int ind=0;ind<str.length();ind++)
        {
            char ch_temp=str.charAt(ind);
            if(ch_temp == split_char)
            {
                index = ind;
                break;
            }
        }
        if(index==-1)
            System.out.println("The string is not splitable");
        else{
            System.out.println(str.substring(0,index+1));
            System.out.println(str.substring(index+1));
        }


        /**Way - 2
         * 
         * int index = str.indexOf(split_char)
         */
    }
}