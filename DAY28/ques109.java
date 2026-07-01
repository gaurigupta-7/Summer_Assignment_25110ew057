import java.util.*;
public class ques109
{
    static String getstatus(boolean issued)
    {
        if(issued)
            return "Issued";
        else
            return "Available";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int bookid[]=new int[100];
        String bookname[]=new String[100];
        String author[]=new String[100];
        String category[]=new String[100];
        boolean issued[]=new boolean[100];
        int count=0;
        int choice=0;

        while(choice!=7)
        {
            System.out.println("\n=============================================================");
            System.out.println("                  LIBRARY MANAGEMENT SYSTEM");
            System.out.println("===============================================================");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Library Summary");
            System.out.println("7. Exit");
            System.out.println("====================================================================");
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count==100)
                    {
                        System.out.println("Libraray is Full!!");
                        break;
                    }
                    System.out.println("Enter Bok ID:");
                    int newbookid=sc.nextInt();
                    int i=0;
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
                    if(!exists)
                    {
                        System.out.println("Bokk ID Already Exists!");
                        break;
                    }
                    bookid[count]=newbookid;
                    sc.nextLine();
                    System.out.println("Enter Book Name:");
                    bookname[count]=sc.nextLine();
                    System.out.println("Enter Author Name:");
                    author[count]=sc.nextLine();
                    System.out.println("Enter Book Category:");
                    category[count]=sc.nextLine();

                    issued[count]=false;
                    count++;
                    System.out.println("\nBook Added Successfully!!");
                    break;
                case 2:
                    if(count==0)
                    {
                        System.out.println("No Books Found!");
                        break;
                    }
                    System.out.println("\n=========================================================");
                    System.out.printf("%-8s %-25s %-20s %-18s %-12s\n" , "ID" , "Book Name" , "Author" , "Category" , "Status");
                    System.out.println("============================================================");
                    i=0;
                    while(i<count)
                    {
                        System.out.printf("%-8s %-25s %-20s %-18s %-12s\n", bookid[i], bookname[i], author[i], category[i], getstatus(issued[i]));
                        i++;
                    }
                    System.out.println("\n===========================================================");
                    System.out.println("Total Books :"+count);
                    break;
                case 3:
                    if(count==0)
                    {
                        System.out.println("No Books Found!");
                        break;
                    }
                    System.out.println("Enter Book ID:");
                    int searchid=sc.nextInt();
                    i=0;
                    boolean found=false;
                    while(i<count)
                    {
                        if(bookid[i]==searchid)
                        {
                            System.out.println("\n==============================================");
                            System.out.println("               BOOK DETAILS");
                            System.out.println("=================================================");
                            System.out.println("Book ID     :"+bookid[i]);
                            System.out.println("Book Name   :"+bookname[i]);
                            System.out.println("Author      :"+author[i]);
                            System.out.println("Category    :"+category[i]);
                            System.out.println("Status      :"+getstatus(issued[i]));
                            System.out.println("==================================================");

                            found=true;
                            break;
                        }
                        i++;
                    }
                    if(!found)
                    {
                        System.out.println("Book Not Found!");

                    }
                    break;
                case 4:
                    if(count==0)
                    {
                        System.out.println("No Books Found!");
                        break;
                    }
                    System.out.println("Enter Book ID  :");
                    int issueid=sc.nextInt();
                    i=0;
                    boolean issuedbook=false;
                    while(i<count)
                    {
                        if(bookid[i]==issueid)
                        {
                            if(issued[i])
                                System.out.println("Book is Already Issued!");
                        
                            else
                            {
                                issued[i]=true;
                                System.out.println("Book Issued Successfully!");
                            }
                            issuedbook=true;
                            break;
                        }
                        i++;
                    }
                    if(!issuedbook)
                    {
                        System.out.println("Book Not Found!");
                    }
                    break;
                case 5:
                    if(count==0)
                    {
                        System.out.println("No Books Found!");
                        break;
                    }
                    System.out.println("Enter Book ID:");
                    int returnid=sc.nextInt();
                    i=0;
                    boolean returned=false;
                    while(i<count)
                    {
                        if(bookid[i]==returnid)
                        {
                            if(!issued[i])
                            {
                                System.out.println("Book is Already Available!");
                            }
                            else
                            {
                                issued[i]=false;
                                System.out.println("Book Returned Successfully!");
                            }
                            returned=true;
                            break;
                        }
                        i++;
                    }
                    if(!returned)
                    {
                        System.out.println("Books Not Found!");
                    }
                    break;
                case 6:
                    if(count==0)
                    {
                        System.out.println("No Books Found!");
                        break;

                    }
                    int availablebooks=0;
                    int issuedbooks=0;
                    i=0;
                    while(i<count)
                    {
                        if(issued[i])
                        {    issuedbooks++;
                        }
                        else
                        {
                            availablebooks++;
                        }
                        i++;
                    }
                    System.out.println("\n===============================================");
                    System.out.println("             LIBRARY SUMMARY");
                    System.out.println("==================================================");
                    System.out.println("Total Books   :"+count);
                    System.out.println("Available Books:"+availablebooks);
                    System.out.println("Issued Books    :"+issuedbooks);
                    System.out.println("===================================================");
                    break;
                case 7:
                    System.out.println("\nThank You for Using Library Management System!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}