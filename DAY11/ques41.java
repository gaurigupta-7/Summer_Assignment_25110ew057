import java.util.Scanner;
public class ques41
{
    static int sum(int a,int b)
    {
        return (a+b);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find their sum:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=sum(num1,num2);
        System.out.println("The sum of "+num1+" and "+num2+" is: "+result);
        sc.close(); 
    }
    
}