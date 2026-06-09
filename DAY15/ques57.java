import java.util.Scanner;
public class ques57
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter an array");
        int i,t;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<(size/2);i++)
        {
            t=arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=t;
        }
        System.out.println("Reversed array:");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}