import java.util.Scanner;
public class ques43
{
    static void chkprime(int num)
    {
        int i,n=num,c=0;
        for (i=1;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==1)
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check prime");
        int n=sc.nextInt();
        chkprime(n);
        sc.close();
    }
}