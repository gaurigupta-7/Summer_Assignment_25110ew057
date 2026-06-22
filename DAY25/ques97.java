import java.util.*;
public class ques97
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 1st array");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter size of 2nd array");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        int i,j,k;
        System.out.println("Enter 1st array");
        for(i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array");
        for(i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int mergearr[]=new int[size1+size2];
        k=0;
        i=0;
        j=0;
        while(i<size1 && j<size2)
        {
            if(arr1[i]<=arr2[j])
            {
                mergearr[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                mergearr[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<size1)
        {
            mergearr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<size2)
        {
            mergearr[k]=arr2[j];
            k++;
            j++;
        }
        System.out.println("Merged sorted array:");
        for(i=0;i<size1+size2;i++)
        {
            System.out.println(mergearr[i]);
        }
        sc.close();
    }

}