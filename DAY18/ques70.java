import java.util.Scanner;
public class ques70
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter an array");
        int i,j,minindex,t;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            minindex=i;
            for(j=i+1;j<size;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
            }
            t=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=t;
        }
        System.out.println("Sorted array:");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}