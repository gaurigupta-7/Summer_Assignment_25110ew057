import java.util.Scanner;
public class ques9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked prime");
        int n=sc.nextInt();
        int i,c=0;
        for (i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println(n+"is a prime number");

        }
        else
        {
            System.out.println(n+"is not a prime number");
        }
    }
}