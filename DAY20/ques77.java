import java.util.Scanner;
public class ques77
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix1:");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int mat1[][]=new int[row1][col1];
        System.out.println("Enter the number of rows and columns of matrix2:");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int mat2[][]=new int[row2][col2];
        if (col1==row2)
        {
            System.out.println("Enter the matrix1:");
            int i,j;
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    mat1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the matrix2:");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    mat2[i][j]=sc.nextInt();
                }
            }
            int finalmat[][]=new int[row1][col2];
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    finalmat[i][j]=0;
                    for(int k=0;k<col1;k++)
                    {
                        finalmat[i][j]+=mat1[i][k]*mat2[k][j];
                    }
                }
            }
            System.out.println("Resultant matrix:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.println(finalmat[i][j]);
                }
            }
        }
        else
        {
            System.out.println("Multipication not possible");
        }
        sc.close();
    }
}