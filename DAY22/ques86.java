import java.util.*;
public class ques86
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int i,sp=1;
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch==' ')
            {
                sp++;
            }
        }
        System.out.println("There are "+sp+" words");
        sc.close();
    }
}