class Patterns{
    public static void main(String[] args)
    {
        /* *****
           *****
           *****
           *****
           *****
        */
        for(int i=0; i<5; i++)//rows
        {
            for(int j=0; j<5; j++)//column
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }



        /*
        *
        **
        ***
        ****
        *****
        */

       for(int i =0; i<5; i++){
        for(int j=0; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println("");
       }


       /*
         *   *
          * *
           *
          * *
         *   *
       */

      for(int i =0; i<5; i++){
        for(int j=0; j<5; j++)
        {
            if(i==j || i+j==5-1){
            System.err.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.err.println("");
       }
      


      /*
           *
          ***
         *****
        *******
       *********
      */

    for(int i=0; i<5; i++)
    {
        for(int space=5-i; space>0; space--){
            System.out.print(" ");
        }
        for(int j=0; j<(2*i-1);j++){
            System.out.print("*");
        }
        System.out.println("");
    }

    System.out.println("");

    /*
      *****
      ****
      ***
      **
      *
    */
   int n = 5;
   for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println("");
       }

    }
} 