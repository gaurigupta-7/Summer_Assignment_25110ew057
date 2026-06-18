import java.util.Scanner;
public class ques68
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of 2 arrays");
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int arr1[]=new int[size1];
        int arr2[]=new int[size2];
        System.out.println("Enter 1st array");
        int i,j;
        for(i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array");
        for(i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("common elements are:");
        for(i=0;i<size1;i++)
        {
            for(j=0;j<size2;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr2[j]);
                    break;
                }
            }
        }
        sc.close();
    }
}