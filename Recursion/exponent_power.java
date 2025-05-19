/*
compute a^n (Exponent / Power Fuction)
*/
import java.util.Scanner;
class exponent_power
{
    static int computePower(int base, int exponent)
    {
        if(base == 0)
            return 0;

        else if(exponent == 0)
            return 1;
        
        else if(exponent == 1)
            return base;
        
        else
            return base * computePower(base, exponent - 1);   // if exponent > 1
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        int res = computePower(base, exponent);
        System.out.println("result = "+res);
    }
}