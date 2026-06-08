import java.util.Scanner;
public class ques50
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i,sum=0,avg;
        System.out.println("Enter the array");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        avg=sum/size;
        System.out.println("sum of the entered array = "+sum);
        System.out.println("average of the entered array = "+avg);
        sc.close();
    }
}