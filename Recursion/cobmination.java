/*
nCr

if (r > n)
    return 0;
if(n==r || r==0)
    return 1;
else if(r==1)
    return n;
else
    return combination(n-1,r) + combination(n-1,r-1)

*/

import java.util.Scanner;

class combination{

    static int combination(int n, r)
    {
        if (r > n)
            return 0;
        if(n==r || r==0)
            return 1;
        else if(r==1)
            return n;
        else
            return combination(n-1,r) + combination(n-1,r-1)
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        res = combination(n,r);

        System.out.println(res);
    }
}