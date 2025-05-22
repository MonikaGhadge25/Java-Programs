// 2D Array

import java.util.Scanner;

class Matrix_2D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] matrix = new int[rows][column];

        System.out.println("Enter the Element for matrix: ");

        for(int row=0; row<rows; row++)
        {
            for(int col=0; col<column; col++)
            {
                matrix[row][col] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");

        for(int row=0; row<matrix.length; row++)  //to find how many rows 
        {
            for(int col=0; col<matrix[0].length; col++)        //to find how many column
            {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}