import java.util.*;
public class ques85
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            rev=rev+ch;
        }
        if(str.equals(rev))
        {
            System.out.println("Entered string is palindrome");
        }
        else
        {
            System.out.println("Entered string is not palindrome");
        }
        sc.close();
    }
}