import java.util.Scanner;
public class ques49
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("Enter the array");
        int i;
        int arr[]=new int[size];
        for (i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The entered array is:");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
