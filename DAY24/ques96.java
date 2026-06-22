import java.util.*;
public class ques96
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String newstr="";
        int i;
        for(i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            if(newstr.indexOf(ch)==-1)
            {
                newstr=newstr+ch;
            }
        }
        System.out.println("String after removing duplicates: "+newstr);
        sc.close();
    }
}