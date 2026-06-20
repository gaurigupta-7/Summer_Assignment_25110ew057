import java.util.Scanner;
public class ques79
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        int i,j;
        System.out.println("Enter the matrix:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum of rows:");
        for(i=0;i<row;i++)
        {
            int sum=0;
            for(j=0;j<col;j++)
            {
                sum=sum+mat[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row = "+sum);
        }
        sc.close();
    }
}