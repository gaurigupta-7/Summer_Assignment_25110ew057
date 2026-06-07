import java.util.*;
public class ques47
{
    static void fibonacci(int num)
    {
        int first=-1, second=1, third=0, i;
        for  (i=1;i<=num;i++)
        {
            third=first+second;
            first=second;
            second=third;
            System.out.println(third);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms to be printed");
        int n=sc.nextInt();
        fibonacci(n);
        sc.close();   
    }
}