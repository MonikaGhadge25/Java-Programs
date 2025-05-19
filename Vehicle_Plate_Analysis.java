/*
vehicle Registration Plate Analysis
The traffic department wants to analyze vehicle registration numbers. Given a number plate (excluding letters), check if the digits form a palindrome. 
If yes, classify the vehicle as "Special", otherwise mark it as "Regular".

Input: Registration number (digits only): '1221'
Output: Special
*/

class Vehicle_Plate_Analysis
{
    public static void main(String[] args)
    {
        int n = 123321;
        int og = n;
        int rev = 0;
        while(n>0)
        {
            int rem = n%10;
            rev = rev *10 + rem;
            n /=10;
        }
        System.out.println(rev==og?"Special":"No");
    }
}