import java.util.*;
public class ques93
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd string");
        String str2=sc.nextLine();
        if(str1.length()==str2.length() && (str1+str1).contains(str2))
        {
            System.out.println("Strings are rotations of each other");
        }
        else
        {
            System.out.println("Strings are not rotations");
        }
        sc.close();
    }
}