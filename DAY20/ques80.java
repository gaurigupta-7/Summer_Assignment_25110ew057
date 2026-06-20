import java.util.Scanner;
public class ques80
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in  matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        int i,j;
        System.out.println("Enter the matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum of columns");
        for(i=0;i<col;i++)
        {
            int sum=0;
            for(j=0;j<row;j++)
            {
                sum=sum+mat[j][i];
            }
            System.out.println("Sum of "+(i+1)+" column = "+sum);
        }
        sc.close();
    }
}