import java.util.Scanner;
public class ques73
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in matrix 1:");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int mat1[][]=new int[row1][col1];
        int i,j;
        System.out.println("Enter matrix 1");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns in matrix 2");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int mat2[][]=new int[row2][col2];
        System.out.println("Enter matrix 2");
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        int newmat[][]=new int[row1][col1];
        if(row1==row2 && col1==col2)
        {
            System.out.println("Matrix after Subtraction:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    newmat[i][j]=mat1[i][j]-mat2[i][j];
                    System.out.println(newmat[i][j]);
                }
            }
        }
        else
        {
            System.out.println("Matrix addition not possible because number of rows and columns of both the matrices are not equal");
        }
        sc.close();
    }
}