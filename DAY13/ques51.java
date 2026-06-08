import java.util.Scanner;
public class ques51
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array");
        int i,large,small;
        for (i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        large=small=arr[0];
        for(i=0;i<size;i++)
        {
            if(large<arr[i])
            {
                large=arr[i];
            }
            if(small>arr[i])
                small=arr[i];
        }
        System.out.println(large+" is largest element in the array");
        System.out.println(small+" is the smallest element in the array");
        sc.close();
    }
}