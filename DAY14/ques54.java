import java.util.Scanner;
public class ques54
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array");
        int i,x,c=0;
        for (i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find its frequency:");
        x=sc.nextInt();
        for(i=0;i<size;i++)
        {
            if (arr[i]==x)
            {
                c++;
            }
        }
        System.out.println("The frequency of "+x+" is "+c);
        sc.close();
    }
}