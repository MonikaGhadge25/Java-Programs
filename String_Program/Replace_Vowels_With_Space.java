/*String Builder
problem-1 : write program to except string input and replace the vowels with the space
*/

// import java.util.Scanner;
// class Replace_Vowels_With_Space
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();   //elephant

//         StringBuilder res = new StringBuilder();   //empty suitable string is created

//         for(int i =0; i<str.length(); i++)
//         {
//             char ch = str.charAt(i);      //ch=e 
//             if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
//                 res.append(' ');
//             else
//                 res.append(ch);
//         }
//         System.out.println(res);   //printing mutable string
//         System.out.println(res.toString());     //convert mutable to immutable and print
//     }
// }


import java.util.Scanner;
class Replace_Vowels_With_Space
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
                res=res+' ';
            else
                res=res+ch;
        }
        System.out.println(res);   //printing mutable string
    }
}