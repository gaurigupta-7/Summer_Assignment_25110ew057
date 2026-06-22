import java.util.*;
public class ques100
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String words[]=str.split(" ");
        int i,c,j;
        for(i=0;i<words.length-1;i++)
        {
            for(j=i+1;j<words.length;j++)
            {
                if(words[i].length()>words[j].length())
                {
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }
        System.out.println("Words sorted by length:");
        for(i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
        sc.close();
    }
}