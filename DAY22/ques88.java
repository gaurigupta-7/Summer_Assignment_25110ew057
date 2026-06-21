import java.util.*;
public class ques88
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String newstr="";
        int i;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                continue;
            }
            newstr=newstr+str.charAt(i);
        }
        System.out.println("New string after removing spaces:\n"+newstr);
        sc.close();
    }
}