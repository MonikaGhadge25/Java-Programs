/*
Automorphic
A number that is squares exactly ends with the number itself.
Input:5
Output:YES
*/

import java.util.Scanner;
class Automorphic_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        String s = String.valueOf(sq);
        System.out.println(s.endsWith(String.valueOf(n))?"Automorphic Number":"No Automorphic Number");
    }
}