import java.util.Scanner;

class valid_date {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int day = ip.nextInt();
        int month = ip.nextInt();
        int year = ip.nextInt();
        boolean isValid = false;
        boolean isLeap = false;
        boolean isVmon = false;
        int noDays = 0;

        if(year >= 1600 && year <= 2025) {
            // check if leap year
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                isLeap = true;

            if(month >= 1 && month <= 12)
                isVmon = true;

            if(isVmon && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))
                noDays = 31;
            else if(isVmon && month == 2)
                noDays = isLeap ? 29 : 28;
            else if(isVmon)
                noDays = 30;

            // final date validation
            if(isVmon && (day >= 1 && day <= noDays))
                isValid = true;
        }

        if(isValid)
            System.out.println("date is valid");
        else
            System.out.println("date is not valid");

        ip.close(); // close scanner
    }
}
