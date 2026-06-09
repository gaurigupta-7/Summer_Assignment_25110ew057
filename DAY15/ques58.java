import java.util.Scanner;
public class ques58
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
        t=arr[size-1];
        for(i=size-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=t;
        System.out.println("Left rotated array");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}