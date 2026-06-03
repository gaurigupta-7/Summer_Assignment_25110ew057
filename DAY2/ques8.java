import java.util.Scanner;
public class ques8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check palindrome");
        int n=sc.nextInt();
        int t=n,d,rev=0;
        while(t!=0)
        {
            d=t%10;
            rev=(rev*10)+d;
            t=t/10;
        }
        if(rev==n)
        {
            System.out.println(n+" is a palindrome number");
        }
        else
        {
            System.out.println(n+"is not a palindrome number");
        }
    }
}
