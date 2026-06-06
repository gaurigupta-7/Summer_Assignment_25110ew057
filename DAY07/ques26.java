package DAY7;
import java.util.Scanner;
public class ques26 {
    static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fibonacci (n-1) + fibonacci (n-2);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int result = fibonacci(n);
        System.out.println("The "+n+"th term of the fibonacci series is "+result);
        sc.close();
    }
    
}
