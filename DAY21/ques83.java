import java.util.*;
public class ques83
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String vol="AEIOUaeiou";
        int v=0,c=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                if(vol.indexOf(ch)!=-1)
                {
                    v++;
                }
                else{
                    c++;
                }
            }
        }
        System.out.println("Vowels = "+v);
        System.out.println("Consonants = "+c);
        sc.close();
    }
}