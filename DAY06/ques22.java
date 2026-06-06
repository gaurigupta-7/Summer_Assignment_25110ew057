import java.util.*;
public class ques22
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number to find its decimal equivalent");
        String binary = sc.nextLine();
        int n=0,i;
        char ch;
        for (i=0;i<binary.length();i++)
        {
            ch=binary.charAt(i);
            if(ch=='1')
            {
                n=n+(int)Math.pow(2,binary.length()-1-i);
            }

        }
        System.out.println("The decimal equivalent of " + binary + " is " + n);
        sc.close();
    }
}