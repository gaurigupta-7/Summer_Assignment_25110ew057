import java.util.*;
public class ques16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting of the range");
        int rs=sc.nextInt;
        System.out.println("Enter the ending of the range");
        int re=sc.nextInt();
        int i;
        for (i=rs;i<=re;i++)
        {
            int t=i,d,arm=0,c=0;
        while(t!=0)
        {
            d=t%10;
            c++;
        }
        t=i;
        while(t!=0)
        {
            d=t%10;
            arm=arm+Math.pow(d,c);

        }
        System.out.println("Armstrong number of"+i+"="+arm);
        }
    }
    
}
