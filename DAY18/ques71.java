import java.util.Scanner;
public class ques71
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of sorted array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i;
        System.out.println("Enter a sorted array");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        int low,high,mid,found;
        low=0;
        high=size-1;
        found=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==key)
            {
               System.out.println("Element found at index "+mid);
               found=1;
               break;
            }
            else if(key<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if(found==0)
        {
            System.out.println("Element not found");
        }
        sc.close();
    }
}