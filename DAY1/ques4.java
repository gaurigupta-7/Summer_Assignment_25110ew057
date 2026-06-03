import java.util.Scanner;
public class ques4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int d,c=0,t=n;
        while (n!=0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        System.out.println("Number of digits in "+t+" = "+c);
        
    }
}
