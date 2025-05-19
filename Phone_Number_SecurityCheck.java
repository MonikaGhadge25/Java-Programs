/*
**Phone Number Security Check**
A company wants to implement a security feature in their system. They need to check if a given phone number (without the country code)
has consecutive repeated digits. if it does, the number is flagged as "Suspicious"; otjerwise, it is marked  as "Safe".

Input: phone number='98766543211'
Output: Suspicious
*/

// import java.util.Scanner;
class Phone_Number_SecurityCheck
{
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        long phone_no = 123456789L; //input is: 7855521912L or 123456789L
        String s = String.valueOf(phone_no);
        boolean found = false;
        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                System.out.println("Suspicious");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Safe");
        }
        // sc.close();
    }
}