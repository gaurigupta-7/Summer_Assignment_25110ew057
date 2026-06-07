import java.util.*;
public class ques48
{
    static void perfectnum(int num)
    {
        int i,sum=0;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==num)
        {
            System.out.println(num+" is a perfect number");
        }
        else
        {
            System.out.println(num+" is not a perfect number");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check perfect number");
        int n=sc.nextInt();
        perfectnum(n);
        sc.close();
    }
}