/* Remove Vowels
*/


import java.util.Scanner;
class remove_vowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   //elephant

        String res = " ";   //empty suitable string is created

        for(int i =0; i<str.length(); i++)
        {
            char ch = str.charAt(i);      //ch=e 
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                res=res.deleteCharAt(i);
            else
                res=res+ch;
        }
        System.out.println(res);   //printing mutable string
    }
}