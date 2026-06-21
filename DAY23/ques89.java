import java.util.*;
public class ques89
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
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
            if(c==1)
            {
                System.out.println("First non-repeating character = "+str.charAt(i));
                break;
            }
        }
        sc.close();
    }
}