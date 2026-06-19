import java.util.Scanner;
public class ques75
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        int transpo[][]=new int[col][row];
        System.out.println("Enter the matrix");
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<col;i++)
        {
            for(j=0;j<row;j++)
            {
                transpo[i][j]=mat[j][i];
                System.out.println(transpo[i][j]);
            }
        }
        sc.close();
    }
}