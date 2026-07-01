import java.util.*;
public class ques118
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int bookid[]=new int[100];
        String bookname[]=new String[100];
        String author[]=new String[100];
        String category[]=new String[100];
        int count=0;
        int choice=0;
        while(choice!=4)
        {
            System.out.println("\n==============================================");
            System.out.println("        MINI LIBRARY SYSTEM");
            System.out.println("================================================");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Search book");
            System.out.println("4. Exit");
            System.out.println("=================================================");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            int i;
            switch(choice)
            {
                case 1:
                    if(count==100)
                    {
                        System.out.println("Library is full!");
                        break;
                    }
                    System.out.println("Enter book ID :");
                    int newbookid=sc.nextInt();
                    i=0;
                    boolean exists=false;
                    while(i<count)
                    {
                        if(bookid[i]==newbookid)
                        {
                            exists=true;
                            break;
                        }
                        i++;
                    }
                    if(exists)
                    {
                        System.out.println("Book ID already exists!");
                        break;
                    }
                    bookid[count]=newbookid;
                    sc.nextLine();
                    System.out.println("Enter book name:");
                    bookname[count]=sc.nextLine();
                    System.out.println("Enter Author name:");
                    author[count]=sc.nextLine();
                    System.out.println("Enter book category:");
                    category[count]=sc.nextLine();
                    count++;
                    System.out.println("\nBook added successfully!!");
                    break;
                case 2:
                    if(count==0)
                    {
                        System.out.println("No books found");
                        break;
                    }
                    System.out.println("\n=================================================");
                    System.out.println("ID\tbook Name\tAuthor\tCategory");
                    System.out.println("====================================================");
                    i=0;
                    while(i<count)
                    {
                        System.out.println(bookid[i]+"\t"+bookname[i]+"\t"+author[i]+"\t"+category[i]);
                        i++;

                    }
                    System.out.println("======================================================");
                    System.out.println("Total Books : "+count);
                    break;
                case 3:
                    if(count==0)
                    {
                        System.out.println("No books found!");
                        break;
                    }
                    System.out.println("Enter book ID:");
                    int searchid=sc.nextInt();
                    i=0;
                    boolean found=false;
                    while(i<count)
                    {
                        if(bookid[i]==searchid)
                        {
                            System.out.println("=========BOOK DETAILS===========");
                            System.out.println("Book ID:"+bookid[i]);
                            System.out.println("Book Name:"+bookname[i]);
                            System.out.println("Author:"+author[i]);
                            System.out.println("Category:"+category[i]);
                            found=true;
                            break;
                        }
                        i++;
                    }
                    if(!found)
                    {
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:
                    System.out.println("\nThank You for Using Mini Library System!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}