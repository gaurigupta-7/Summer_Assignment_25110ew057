import java.util.Scanner;
public class ques45
{
    static void palin(int num)
    {
        int t=num,d,rev=0;
        while(t>0)
        {
            d=t%10;
            rev=(rev*10)+d;
            t=t/10;
        }
        if(rev==num)
        {
            System.out.println(num+" is palindrome number");
        }
        else
        {
            System.out.println(num+" is not a palindrome number");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        palin(n);
        sc.close();
    }
}