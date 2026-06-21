import java.util.*;
public class ques2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int i,j,c,maxf=0;
        char maxc=' ';
        for(i=0;i<str.length();i++)
        {
            c=0;
            for(j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    c++;
                }
            }
            if(maxf<c)
            {
                maxf=c;
                maxc=str.charAt(i);
            }
        }
        System.out.println("Maximum occurring character is "+maxc+" which is "+maxf);
        sc.close();
    }
}