import java.util.*;
public class ques99
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int n=sc.nextInt();
        String names[]=new String[n];
        int i,j;
        System.out.println("Enter names:");
        sc.nextLine();
        for(i=0;i<n;i++)
        {
            names[i]=sc.nextLine();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(names[j].compareTo(names[j+1])>0)
                {
                    String t=names[j];
                    names[j]=names[j+1];
                    names[j+1]=t;
                }
            }
        }
        System.out.println("Names sorted in alphabetical order:");
        for(i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
        sc.close();
    }
}