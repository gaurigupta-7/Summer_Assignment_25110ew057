import java.util.Scanner;
public class ques76
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        int i,j,sum=0;
        System.out.println("Enter the matrix:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
                if(i==j)
                {
                    sum=sum+mat[i][j];
                }
            }
        }
        System.out.println("The sum of diagonals of matrix is "+sum);
        sc.close();
    }
}