import java.util.Scanner;
public class ques2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print multiplication table");
        int n=sc.nextInt();
        int i;
        for (i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+(i*n));
        }
        System.out.println("complete");
    }
}