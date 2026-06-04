package DAY5;
import java.util.*;
public class ques20 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the the largest prime factor of");
        int n=sc.nextInt();
        int i,j,c,pfact=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                c=0;
                for(j=1;j<i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c==1)
                {
                    pfact=i;
                }
            }
        }
        System.out.println("The largest prime factor of "+n+" is "+pfact);
    }
    
}
