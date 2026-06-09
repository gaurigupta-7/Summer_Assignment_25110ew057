import java.util.Scanner;
public class ques63
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter an array");
        int i,j,sum;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sum to find pairs");
        sum=sc.nextInt();
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println("Pair is of "+arr[i]+" and "+arr[j]);
                }
            }
        }
        sc.close();
    }
}