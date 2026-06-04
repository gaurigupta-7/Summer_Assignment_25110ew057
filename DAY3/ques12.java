import java.util.*;
public class ques12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers to find LCM of");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i, lcm = a*b;
        for (i=1;i<=a*b;i++)
        {
            if (i%a==0 && i%b==0)
            {
                lcm=i;
            }
        }
        System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
    }
}
