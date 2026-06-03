import java.util.Scanner;
public class ques14
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N of which Nth term is to be printed");
        int n=sc.nextInt();
        int first, second, third, i;
        first= -1;
        second= 1;
        for(i=1;i<=n;i++)
        {
            third= first+ second;
            first= second;
            second= third;

        }
        System.out.println(third+"is the"+n+"th term of fibonacci series");
    }
}