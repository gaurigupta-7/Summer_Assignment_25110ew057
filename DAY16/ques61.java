import java.util.Scanner;
public class ques61
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i,miss;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n=size+1;
        int expsum=n*(n+1)/2;
        int actsum=0;
        for(i=0;i<size;i++)
        {
            actsum=actsum+arr[i];
        }
        miss=expsum-actsum;
        System.out.println("Missing number = "+miss);
        sc.close();
    }
}