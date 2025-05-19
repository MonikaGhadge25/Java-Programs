/*String Program
Accept name ang age of the given person and print them in this format:"NAME:AGE"
*/
import java.util.Scanner;
class Name_Age
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        System.out.print(name+ ":" +age);
    }
}