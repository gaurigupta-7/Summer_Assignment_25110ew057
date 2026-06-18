import java.util.Scanner;
public class ques65
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of both the arrays");
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int arr1[]=new int[size1];
        int arr2[]=new int[size2];
        int mergedarr[]=new int[size1+size2];
        int i,j;
        System.out.println("Enter 1st array");
        for(i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
            mergedarr[i]=arr1[i];
        }
        System.out.println("Enter 2nd array");
        for(i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
            mergedarr[size1+i]=arr2[i];
        }
        System.out.println("Merged array:");
        for(i=0;i<size1+size2;i++)
        {
            System.out.println(mergedarr[i]);
        }
        sc.close();
    }
}