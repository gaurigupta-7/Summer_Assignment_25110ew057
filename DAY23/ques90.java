import java.util.*;
public class ques90
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int i,j;
        for(i=0;i<str.length();i++)
        {
            int c=0;
            for(j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    c++;
                }
            }
            if(c!=1)
            {
                System.out.println("First repeating character is "+str.charAt(i));
                break;
            }
        }
        sc.close();
    }
}