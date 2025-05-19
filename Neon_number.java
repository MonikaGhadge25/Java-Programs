// ?? 81=> 8+1=>9
// 1 => 1 = 1
// 0 => 0 = 0
// sum of digits its of square of input number is same as the input number itself.
class Neon_number
{
    public static void main(String[] args)
    {
        int n = 9;
        int og = n;
        int sq = n*n;
        int sum = 0;
        while(sq>0){
            int rem = sq%10;
            sum += rem;
            sq /=10;
        }
        System.out.println(sum==og?"Yes":"No");
    }
}