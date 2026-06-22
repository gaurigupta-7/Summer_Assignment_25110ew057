import java.util.*;
public class ques98
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd string");
        String str2=sc.nextLine();
        int i,j;
        System.out.println("Common charcters are:");
        for(i=0;i<str1.length();i++)
        {
            for(j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    System.out.println(str1.charAt(i));
                    break;
                }
            }
        }
        sc.close();
    }
}