package DAY5;
import java.util.*;
public class ques17
{
    public static void main(String[] args);
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check perfect number or not");
        int n=sc.nextInt();
        int i,sum=0;
        for (i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum=i;
            }
        }
        if(sum==n)
        {
            System.out.println(n+"is a perfect number");
        }
        else{
            System.out.println(n+"is not a perfect number");
        }
    }    
}
