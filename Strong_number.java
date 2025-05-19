// Strong Number
// ?? 
// 145
// 1! + 4! + 5! = 1 + 24 + 120 = 145

class Strong_number {
    public static void main(String[] args) {
        int n = 145;
        int og = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += factorial(rem);
            n /= 10;
        }

        System.out.println(sum == og ? "Strong Number" : "No Strong Number");
    }

    // helper method must be outside main
    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
