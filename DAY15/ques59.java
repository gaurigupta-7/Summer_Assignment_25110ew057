import java.util.Scanner;
public class ques59
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter an array");
        int i,t;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        t=arr[0];
        for(i=1;i<size;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[size-1]=t;
        System.out.println("Right rotated array");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}