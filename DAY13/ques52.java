import java.util.Scanner;
public class ques52
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array");
        int i,ceven=0,codd=0;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                ceven++;
            }
            else{
                codd++;
            }
        }
        System.out.println("Odd elements = "+codd);
        System.out.println("Even elements = "+ceven);
        sc.close();
    }
}