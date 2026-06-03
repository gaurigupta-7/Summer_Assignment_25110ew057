import java.util.Scanner;
public class ques4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int d,c=0;
        while (n!=0)
        {
            d=n%10;
            c++;
        }
        System.out.println("Number of digits in"+n+"="+c);
        
    }
}