// check if the number is ronaldo number or not

class ronaldo_number
{
    public static void main(String[] args)
    {
        int n = 1234556;
        int digits = String.valueOf(n).length()-1;
        int first = n/(int)Math.pow(10,digits);
        int last = n%10;
        /*
         * 123/100
         * 1234/1000
         * 12345/100000
        */

       System.out.println(first+last==7?"Yes":"No");

    }
}