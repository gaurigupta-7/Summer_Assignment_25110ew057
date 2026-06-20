import java.util.*;
public class ques84
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String res="";
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                res=res+Character.toUpperCase(ch);
            }
        }
        System.out.println(res);
        sc.close();
    }
}