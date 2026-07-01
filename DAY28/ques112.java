import java.util.*;
public class ques112
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String names[]=new String[100];
        String phones[]=new String[100];
        String emails[]=new String[100];
        String categories[]=new String[100];
        boolean favourites[]=new boolean[100];
        int count=0;
        int choice=0;

        while(choice!=10)
        {
            System.out.println("\n============CONTACT MANAGEMENT SYSTEM=============");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Search Contact by Phone");
            System.out.println("5. Update Contact");
            System.out.println("6. Delete Contact");
            System.out.println("7. Mark Favourite");
            System.out.println("8. View Favourite Contacts");
            System.out.println("9. Sort Contacts");
            System.out.println("10. Exit");
            System.out.println("Enter Your Choice:");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    if(count==100)
                    {
                        System.out.println("Contact list is Full!!");
                        break;
                    }
                    System.out.println("Enter Phone Number:");
                    String phone=sc.nextLine();
                    boolean duplicate=false;
                    int i;
                    for(i=0;i<count;i++)
                    {
                        if(phones[i].equals(phone))
                        {
                            duplicate=true;
                            break;
                        }
                    }
                    if(duplicate)
                    {
                        System.out.println("Phone Number Already Exists!!");
                        break;
                    }
                    phones[count]=phone;
                    System.out.println("Enter Name:");
                    names[count]=sc.nextLine();
                    System.out.println("Enter Email:");
                    emails[count]=sc.nextLine();
                    System.out.println("Enter Category:");
                    categories[count]=sc.nextLine();
                    favourites[count]=false;
                    count++;
                    System.out.println("Contact Added Successfully!!");
                    break;
                case 2:
                    if(count==0)
                    {
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    System.out.println("\n------------CONTACT LIST------------");
                    for(i=0;i<count;i++)
                    {
                        System.out.println("Contact "+(i+1));
                        System.out.println("Name :"+names[i]);
                        System.out.println("Phone :"+emails[i]);
                        System.out.println("Email :"+emails[i]);
                        System.out.println("Category :"+categories[i]);
                        System.out.println("Favourite :"+(favourites[i]?"Yes":"No"));
                        System.out.println();
                    }
                    break;
                case 3:
                    if(count==0)
                    {
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    System.out.println("Enter Name to Search:");
                    String searchname=sc.nextLine();
                    boolean found=false;
                    for(i=0;i<count;i++)
                    {
                        if(names[i].equalsIgnoreCase(searchname))
                        {
                            System.out.println("Name  :"+names[i]);
                            System.out.println("Phone  :"+phones[i]);
                            System.out.println("Email  :"+emails[i]);
                            System.out.println("Category  :"+categories[i]);
                            System.out.println("Favourite  :"+(favourites[i]?"Yes":"No"));
                            found=true;
                            break;
                        }

                    }
                    if(!found)
                    {
                        System.out.println("Contact Not Found!!");
                    }
                    break;
                case 4:
                    if(count==0)
                    {
                        System.out.println("No Contact Found!");
                        break;
                    }
                    System.out.println("Enter Phone Number to search:");
                    String searchphone=sc.nextLine();
                    found=false;
                    for(i=0;i<count;i++)
                    {
                        if(phones[i].equals(searchphone))
                        {
                            System.out.println("Name  :"+names[i]);
                            System.out.println("Phone  :"+phones[i]);
                            System.out.println("Email  :"+emails[i]);
                            System.out.println("Category  :"+categories[i]);
                            System.out.println("Favourite  :"+(favourites[i]?"Yes":"No"));
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Contact Not Found!");
                    }
                    break;
                case 5:
                    if(count==0)
                    {
                        System.out.println("No Contact FOund!");
                        break;
                    }
                    System.out.println("Enter Name To Update:");
                    String updatename=sc.nextLine();
                    boolean updated=false;
                    for(i=0;i<count;i++)
                    {
                        if(names[i].equalsIgnoreCase(updatename))
                        {
                            System.out.println("Enter New Name:");
                            names[i]=sc.nextLine();
                            System.out.println("Enter new phone number:");
                            phones[i]=sc.nextLine();
                            System.out.println("Enter new email:");
                            emails[i]=sc.nextLine();
                            System.out.println("Enter new category:");
                            categories[i]=sc.nextLine();
                            System.out.println("Contact updated successfully!!");
                            updated=true;
                            break;
                        }
                    }
                    if(!updated)
                    {
                        System.out.println("Contact Not Found!");

                    }
                    break;
                case 6:
                    if(count==0)
                    {
                        System.out.println("Contact Not Found!!");
                        break;
                    }
                    System.out.println("Enter Name to delete:");
                    String delname=sc.nextLine();
                    boolean deleted=false;
                    for(i=0;i<count;i++)
                    {
                        if(names[i].equalsIgnoreCase(delname))
                        {
                            for(int j=i;j<count-1;j++)
                            {
                                names[j]=names[j+1];
                                phones[j]=phones[j+1];
                                emails[j]=emails[j+1];
                                categories[j]=categories[j+1];
                                favourites[j]=favourites[j+1];
                            }
                            count--;
                            deleted=true;
                            System.out.println("Contact deleted Successfully!!");
                            break;
                        }
                    }
                    if(!deleted)
                    {
                        System.out.println("Contact Not FOund!!");
                        
                    }
                    break;
                case 7:
                    if(count==0)
                    {
                        System.out.println("No Contact FOund!!");
                        break;
                    }
                    System.out.println("Enter Name to mark fav:");
                    String favname=sc.nextLine();
                    boolean marked=false;
                    for(i=0;i<count;i++)
                    {
                        if(names[i].equalsIgnoreCase(favname))
                        {
                            favourites[i]=true;
                            marked=true;
                            System.out.println("Contact Marked As Fav");
                            break;
                        }
                    }
                    if(!marked)
                    {
                        System.out.println("Contact not found");

                    }
                    break;
                case 8:
                    if(count==0)
                    {
                        System.out.println("contact not found!!");
                        break;
                    }
                    boolean hasfav=false;
                    System.out.println("\n------------FAV CONTACTS---------------");
                    for(i=0;i<count;i++)
                    {
                        if(favourites[i])
                        {
                            System.out.println("Name  :"+names[i]);
                            System.out.println("Phone  :"+phones[i]);
                            System.out.println("Email  :"+emails[i]);
                            System.out.println("Category  :"+categories[i]);
                            hasfav=true;
                        }
                    }
                    if(!hasfav)
                    {
                        System.out.println("no fav contatc found!!");
                    }
                    break;
                case 9:
                    if(count==0)
                    {
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    for(i=0;i<count;i++)
                    {
                        for(int j=0;j<count;j++)
                        {
                            if(names[j].compareToIgnoreCase(names[j+1])>0)
                            {
                                String tempname=names[j];
                                names[j]=names[j+1];
                                names[j+1]=tempname;
                                String tempphone=phones[j];
                                phones[j]=phones[j+1];
                                phones[j+1]=tempphone;
                                String tempemail=emails[j];
                                emails[j]=emails[j+1];
                                emails[j+1]=tempemail;
                                String tempcat=categories[j];
                                categories[j]=categories[j+1];
                                categories[j+1]=tempcat;
                                boolean tempfav=favourites[j];
                                favourites[j]=favourites[j+1];
                                favourites[j+1]=tempfav;

                            }
                        }
                    }
                    System.out.println("Contacts Sorted Successfully!!");
                    break;
                case 10:
                    System.out.println("Thank You for using contact management system!!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}