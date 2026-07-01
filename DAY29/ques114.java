import java.util.*;
public class ques114
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        int size=0;
        int init[]={12,45,7,93,28,56,3,71};
        int i,j;
        for(i=0;i<init.length;i++)
        {
            arr[size]=init[i];
            size++;
        }
        int choice=-1;

        while(choice!=0)
        {
            System.out.println("===========ARRAY OPERATIONS===============");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Sort Ascending");
            System.out.println("5. Sort Decending");
            System.out.println("6. Reverse Element");
            System.out.println("7. Min/Max");
            System.out.println("8. Sum & Avg");
            System.out.println("9. Display array");
            System.out.println("10. Clear array");
            System.out.println("0. Exit");
            System.out.println("\nCurrent Array:");
            for(i=0;i<size;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("\nEnter Your choice:");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter value to insert:");
                    int val=sc.nextInt();
                    System.out.println("Enter index (-1 for end)");
                    int idx=sc.nextInt();
                    if(size>=arr.length)
                    {
                        System.out.println("Array is full!");
                    }
                    else if(idx==-1||idx>=size)
                    {
                        arr[size]=val;
                        size++;
                        System.out.println("Element inserted successfully!");
                    }
                    else if(idx<0)
                    {
                        System.out.println("Invalid index.");
                    }
                    else
                    {   for(i=size;i>idx;i--)
                    {
                        arr[i]=arr[i-1];
                    }
                    arr[idx]=val;
                    size++;
                    System.out.println("Element inserted successfully!");
                    }
                    break;
                case 2:
                    if(size==0)
                    {
                        System.out.println("Array is empty!");
                        break;
                    }
                    System.out.println("Enter value to delete:");
                    val=sc.nextInt();
                    int pos=-1;
                    for(i=0;i<size;i++)
                    {
                        if(arr[i]==val)
                        {
                            pos=i;
                            break;
                        }
                    }
                    if(pos==-1)
                        System.out.println("Element not found!");
                    else
                    {
                        for(i=pos;i<size-1;i++)
                        {
                            arr[i]=arr[i+1];
                        }
                        size--;
                        System.out.println("Element deleted successfully!");
                    }
                    break;
                case 3:
                    if(size==0)
                    {
                        System.out.println("Array is empty!");
                        break;
                    }
                    System.out.println("Enter value to search:");
                    val=sc.nextInt();
                    boolean found=false;
                    for(i=0;i<size;i++)
                    {
                        if(arr[i]==val)
                        {
                            System.out.println("Element found at index "+i);
                            found=true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Element not found");
                    }
                    break;
                case 4:
                    for(i=0;i<size-1;i++)
                    {
                        for(j=0;j<size-i;j++)
                        {
                            if(arr[j]>arr[j+1])
                            {
                                int temp=arr[j];
                                arr[j]=arr[j+1];
                                arr[j+1]=temp;
                            }
                        }
                    }
                    System.out.println("Array Sorted in ascending order.");
                    break;
                case 5:
                    for(i=0;i<size-1;i++)
                    {
                        for(j=0;j<size-1-i;j++)
                        {
                            if(arr[j]<arr[j+1])
                            {
                                int temp=arr[j];
                                arr[j]=arr[j+1];
                                arr[j+1]=temp;
                            }
                        }
                    }
                    System.out.println("Array sorted in descending order");
                    break;
                case 6:
                    for(i=0,j=size-1;i<j;i++)
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                    System.out.println("Array reversed");
                    break;
                case 7:
                    if(size==0)
                    {
                        System.out.println("Array is Empty!");
                        break;
                    }
                    int min=arr[0];
                    int max=arr[0];
                    for(i=1;i<size;i++)
                    {
                        if(arr[i]<min)
                        {
                            min=arr[i];
                        }
                        if(arr[i]>max)
                        {
                            max=arr[i];
                        }
                    }
                    System.out.println("Minimum Element ="+min);
                    System.out.println("Maximum Element ="+max);
                    break;
                case 8:
                    if(size==0)
                    {
                        System.out.println("Array is empty!");
                        break;
                    }
                    int sum=0;
                    for(i=0;i<size;i++)
                    {
                        sum+=arr[i];
                    }
                    double avg=(double)sum/size;
                    System.out.println("Sum = "+sum);
                    System.out.println("Avg = "+avg);
                    break;
                case 9:
                    if(size==0)
                    {
                        System.out.println("Array is empty!");
                        
                    }
                    else
                    {
                        System.out.println("Array :");
                        for(i=0;i<size;i++)
                        {
                            System.out.print(arr[i]+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 10:
                    size=0;
                    System.out.println("Array cleared successfully!!");
                    break;
                case 0:
                    System.out.println("Exiting...Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        }
        sc.close();
    }
}