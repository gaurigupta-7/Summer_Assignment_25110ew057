import java.util.Scanner;
public class ques62
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter an array");
        int i,j,c,maxfreq=0,maxele;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        maxele=arr[0];
        for(i=0;i<size;i++)
        {
            c=1;
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(maxfreq<c)
            {
                maxfreq=c;
                maxele=arr[i];
            }
        }
        System.out.println("Maximum frequency = "+maxfreq);
        System.out.println("Element = "+maxele);
        sc.close();
    }
}