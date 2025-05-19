// check number is armstrong number or not

class armstrong_number
{
    public static void main(String[] args)
    {
        int n = 123;
        int og = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem,digits);
            n/=10;
        }
        if(sum==og){
        System.out.println("arm number");
        }
        else{
            System.out.println("not arm number");
        }
    }
}