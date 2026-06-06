import java.util.Scanner;
public class ques42
{
    static int maximum(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find their maximum:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=maximum(num1,num2);
        System.out.println("The maximum of "+num1+" and "+num2+" is: "+result);
        sc.close();
    }
}