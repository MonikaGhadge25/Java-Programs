/* Ziq - Zaq Printing Matrix */

import java.util.Scanner;
class Ziq_Zaq_Print_Matrix
{
    static void ziqzaqPrint(int[][] matrix)
    {
        for(int row=0; row<matrix.length; row++)
        {
            if(row % 2==0)
            {
                for(int col=0; col<matrix[0].length; col++)
                {
                    System.out.print(matrix[row][col]+" ");
                }
                System.out.println();
            }

            else{
                for(int col=matrix[0].length-1; col >=0; col--)
                {
                    System.out.print(matrix[row][col]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] matrix = new int[rows][column];

        for(int row=0; row<rows; row++)
        {
            for(int col=0; col<column; col++)
            {
                matrix[row][col] = sc.nextInt();
            }
        }

        ziqzaqPrint(matrix);
    }
}