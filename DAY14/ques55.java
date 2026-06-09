import java.util.Scanner;
public class ques55
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array");
        int i,large,seclarge;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        large=seclarge=arr[0];
        for(i=0;i<size;i++)
        {
            if(arr[i]>large)
            {
                seclarge=large;
                large=arr[i];
            }
            else if(arr[i]>seclarge && arr[i]!=large)
            {
                seclarge=arr[i];
            }
        }
        System.out.println("Second largest element = "+seclarge);
        sc.close();
    }
}