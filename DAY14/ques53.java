import java.util.Scanner;
public class ques53
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array");
        int i,x,flag=0;
        for (i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        x=sc.nextInt();
        for(i=0;i<size;i++)
        {
            if(arr[i]==x)
            {   
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(x+" is found at index "+i);
        }
        else
        {
            System.out.println(x+" is not found");
        }
        sc.close();
    }
}