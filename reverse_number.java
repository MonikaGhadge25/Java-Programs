class reverse_number
{
    public static void main(String[] args)
    {
        int n = 123;
        /*
         * 1   2  3
           100 10 1
        */
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            /*rev = 0
             * 0*10 + 3 =3
             * 3*10 + 2 = 32
             * 32*10 + 1 = 321
             */
            n/=10;
        }
        System.out.println(rev);
    }
}