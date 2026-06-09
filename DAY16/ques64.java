import java.util.Scanner;
public class ques64
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of an array");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter an array");
            int i,j;
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
                        arr[i]=arr[j]=0;
                    }
                }
            }
            System.out.println("Changed array");
            for(i=0;i<size;i++)
            {
                System.out.println(arr[i]);
            }
            sc.close();
        }
    }
