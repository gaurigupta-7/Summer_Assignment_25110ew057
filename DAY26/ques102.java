import java.util.*;
public class ques102
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age<18)
        {
            System.out.println("You are under age and not eligible for voting");
            System.out.println("you can vote after "+(18-age)+" year(s)");
        }
        else
        {
            System.out.println("You are eligible for voting");
        }
        sc.close();
    }
}