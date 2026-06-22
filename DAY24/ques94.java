import java.util.*;
public class ques94
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String compre="";
        int i,c=0;
        for(i=0;i<str.length();i++)
        {
            if(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                c++;
            }
            else
            {
                compre=compre+str.charAt(i)+c;
                c=1;
            }
        }
        System.out.println("Compressed String = "+compre);
        sc.close();
    }
}