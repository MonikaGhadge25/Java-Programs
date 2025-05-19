// Duck number
// A number that should have 0 but not in the first place

class Duck_number
{
    public static void main(String[] args)
    {
        // Duck Number
        int n = 0110;
        // string =>"0110" 
        String s = String.valueOf(n);
        if(s.charAt(0)!='0' && s.contains("0")){
            System.err.println("Duuck Number");
        }
        else{
            System.err.println("No Duck Number");
        }
    }
}