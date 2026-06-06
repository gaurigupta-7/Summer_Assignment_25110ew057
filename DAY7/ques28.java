import java.util.*;
public class ques28
{
    static int revnumber(int n, int rev)
    {
        if (n==0)
        {
            return rev;
        }
        return revnumber(n/10, rev*10+n%10);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be reversed");
        int n=sc.nextInt();
        int result = revnumber(n, 0);
        System.out.println("The reversed number is "+result);
        sc.close();
    }
}