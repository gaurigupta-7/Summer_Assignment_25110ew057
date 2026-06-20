import java.util.*;
public class ques81
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int c=0,i;
        for(char ch: str.toCharArray())
        {
            c++;
        }
        System.out.println("Length of string : "+c);
        sc.close();
    }
}