import java.util.Scanner;
public class ques56
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array");
        int i,j,flag=0;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=1;
                    System.out.println("Duplicate element is "+arr[i]);
                }
            }
        }
        if(flag==0)
        {
            System.out.println("There are n duplicates");
        }
        sc.close();
    }
}