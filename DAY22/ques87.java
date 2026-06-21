import java.util.*;
public class ques87
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int i,j,k;
        for(i=0;i<str.length();i++)
        {
            int c=1;
            if(str.charAt(i)==' ')
            {
                continue;
            }
            for(j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    c++;
                }
            }
            boolean alreadyc=false;
            for(k=0;k<i;k++)
            {
                if(str.charAt(i)==str.charAt(k))
                {
                    alreadyc=true;
                    break;
                }
            }
            if(!alreadyc)
            {
                System.out.println(str.charAt(i)+" = "+c);
            }
        }
        sc.close();
    }
}