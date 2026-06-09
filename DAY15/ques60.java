import java.util.Scanner;
public class ques60
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter an array");
        int i,index=0;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<size)
        {
            arr[index]=0;
            index++;
        }
        System.out.println("New array");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}