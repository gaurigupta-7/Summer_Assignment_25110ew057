import java.util.Scanner;
public class ques66
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of both the arrays");
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int arr1[]=new int[size1];
        int arr2[]=new int[size2];
        int union[]=new int[size1+size2];
        System.out.println("Enter 1st array");
        int i,j,k=0;
        boolean found;
        for(i=0;i<size1;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array");
        for(i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Union array:");
        for(i=0;i<size1;i++)
        {
            union[k]=arr1[i];
            k++;
        }
        for(i=0;i<size2;i++)
        {
            found=false;
            for(j=0;j<size1;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                union[k]=arr2[i];
                k++;
            }
        }
        for(i=0;i<k;i++)
        {
            System.out.println(union[i]);
        }
        sc.close();
    }
}