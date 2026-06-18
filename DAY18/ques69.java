import java.util.Scanner;
public class ques69
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter an array");
        int i,j,t;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            for(j=0;j<size-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("Array sortted with Bubble sort:");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}