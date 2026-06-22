import java.util.*;
public class ques95
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str+' ';
        int i,j=0,longest=0,k;
        String word="";
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                if(longest<(i-j))
                {
                    longest=i-j;
                    for(k=j;k<i;k++)
                    {
                        word=word+str.charAt(k);
                    }
                }
                j=i;
            }
        }
        System.out.println("Longest word is "+word);
        sc.close();
    }
}