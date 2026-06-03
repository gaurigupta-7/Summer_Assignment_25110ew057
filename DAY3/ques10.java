import java.util.Scanner;
public class ques10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting of range");
        int rs=sc.nextInt();
        System.out.println("Enter ending of range");
        int re=sc.nextInt();
        int i,j,c;
        for (i=rs;i<=re;i++)
        {
            c=0;
            for (j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }

            }
            if(c==2)
            {
                System.out.println(j);
            }
        }
    }
}
