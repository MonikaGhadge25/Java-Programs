//search element is available in the matrix or not

import java.util.Scanner;
class Search_Element_2DArray
{
    static boolean  searchElement(int[][] matrix, int serachKey)
    {
        for(int row=0; row<matrix.length; row++)
        {
            for(int col=0; col<matrix[0].length; col++)
            {
                if(matrix[row][col] == serachKey)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int noRow = sc.nextInt();
        int noCol = sc.nextInt();
        int[][] matrix = new int[noRow][noCol];

        for(int row = 0; row<noRow; row++)
        {
            for(int col=0; col<noCol; col++)
            {
                matrix[row][col] = sc.nextInt();
            }
        }

        int serachKey = sc.nextInt();
        if(searchElement(matrix,serachKey))
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
}