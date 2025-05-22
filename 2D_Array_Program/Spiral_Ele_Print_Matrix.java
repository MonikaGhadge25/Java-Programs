//spiral way to print the Matrix Element

import java.util.Scanner;
class Spiral_Ele_Print_Matrix
{
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

    }
}