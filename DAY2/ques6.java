import java.util.Scanner;
public class ques6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find reverse of");
        int n=sc.nextInt();
        int rev=0,d, t=n;
        while (n!=0)
        {
            d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        System.out.println("Reverse of "+t+" = "+rev);
    }
}
