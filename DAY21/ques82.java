import java.util.*;
public class ques82
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String newstr;
        newstr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            newstr=newstr+str.charAt(i);
        }
        System.out.println("Reversed string:");
        System.out.println(newstr);
        sc.close();
    }
}