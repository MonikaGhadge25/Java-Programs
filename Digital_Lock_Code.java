

/*
Digital Lock Code Challenge
A digital lock system allows access only if the sum of the first half of the digits in the access code matches the sum of the 
second half. Given a numeric access code, determine whether it is "Valid Code" or "Invalid Code"

Input: Access Code: '123321'
Output: Valid Code
*/
public class Digital_Lock_Code
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        int n = 123231;
        String s = String.valueOf(n);
        int fsum = 0;
        int ssum = 0 ;
        for(int i=0;i<s.length()/2;i++)
        {
            fsum += Character.getNumericValue(s.charAt(i));
        }
        for(int i=s.length()/2; i<s.length();i++)
        {
            ssum += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(fsum == ssum ? "Valid Code":"Invalid Code");
    }
}
