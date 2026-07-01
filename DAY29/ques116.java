import java.util.*;
public class ques116
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int productid[]=new int[100];
        String productname[]=new String[100];
        double productprice[]=new double[100];
        int productquantity[]=new int[100];
        int size=0;
        int choice=-1;
        int i;

        while(choice!=10)
        {
            System.out.println("\n=========INVENTORY MANAGEMENT===========");
            System.out.println("1. Add Product");
            System.out.println("2. View PRoduct");
            System.out.println("3. Search Product");
            System.out.println("4. Update PRoduct");
            System.out.println("5. Delete product");
            System.out.println("6. Check Stock");
            System.out.println("7. Restock Product");
            System.out.println("8. Sell Product");
            System.out.println("9. Total Inventory Product");
            System.out.println("10. Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(size==productid.length)
                    {
                        System.out.println("Inventory is full!");
                        break;
                    }
                    System.out.println("Enter Product id");
                    productid[size]=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter PRoduct Name:");
                    productname[size]=sc.nextLine();
                    System.out.println("Enter Product Price:");
                    productprice[size]=sc.nextDouble();
                    System.out.println("Enter PRoduct Quantity:");
                    productquantity[size]=sc.nextInt();
                    size++;
                    System.out.println("PRoduct added successfully!!");
                    break;
                case 2:
                    if(size==0)
                    {
                        System.out.println("Inventory is empty!!");
                    }
                    else
                    {
                        System.out.println("\nID\tName\tPrice\tQuantity");
                        for(i=0;i<size;i++)
                        {
                            System.out.println(productid[i]+"\t"+productname[i]+"\t"+productprice[i]+"\t"+productquantity[i]);

                        }
                    }
                    break;
                case 3:
                    if(size==0)
                    {
                        System.out.println("Inventory is Empty!");
                        break;
                    }
                    System.out.println("Enter PRoduct ID:");
                    int id=sc.nextInt();
                    boolean found=false;
                    for(i=0;i<size;i++)
                    {
                        if(productid[i]==id)
                        {
                            System.out.println("Product Found");
                            System.out.println("Name  :"+productname[i]);
                            System.out.println("Price  :"+productprice[i]);
                            System.out.println("Quantity  :"+productquantity[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("PRoduct not found");
                    }
                    break;
                case 4:
                    if(size==0)
                    {
                        System.out.println("Inventory is Empty!");
                        break;
                    }
                    System.out.println("Enter PRoduct ID:");
                    id=sc.nextInt();
                    found=false;
                    for(i=0;i<size;i++)
                    {
                        if(productid[i]==id)
                        {
                            sc.nextLine();
                            System.out.println("Enter NEw PRoduct Name:");
                            productname[i]=sc.nextLine();
                            System.out.println("Enter New Product Price:");
                            productprice[i]=sc.nextDouble();
                            System.out.println("Enter New PRoduct Quantity:");
                            productquantity[i]=sc.nextInt();
                            System.out.println("Product Update successfully!");
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Product not found!");
                    }
                    break;
                case 5:
                    if(size==0)
                    {
                        System.out.println("Inventory is empty!");
                        break;
                    }
                    System.out.println("Enter product ID:");
                    id=sc.nextInt();
                    int pos=-1;
                    for(i=0;i<size;i++)
                    {
                        if(productid[i]==id)
                        {
                            pos=i;break;
                        }
                    }
                    if(pos==-1)
                    {
                        System.out.println("Product not found!!");
                    }
                    else{
                        for(i=pos;i<size;i++)
                        {
                            productid[i]=productid[i+1];
                            productname[i]=productname[i+1];
                            productprice[i]=productprice[i+1];
                            productquantity[i]=productquantity[i+1];
                        }
                        size--;
                        System.out.println("product deleted successfully!");
                    }
                    break;
                case 6:
                    if(size==0)
                    {
                        System.out.println("Inventory is empty!");
                        break;
                    }
                    System.out.println("Enter product ID:");
                    id=sc.nextInt();
                    found=false;
                    for(i=0;i<size;i++)
                    {
                        if(productid[i]==id)
                        {
                            System.out.println("Product name:"+productname[i]);
                            System.out.println("Available stock :"+productquantity[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Product not found!");
                    }
                    break;
                case 7:
                    if(size==0)
                    {
                        System.out.println("Inventory is empty!");
                        break;
                    }
                    System.out.println("Enter product ID:");
                    id=sc.nextInt();
                    found=false;
                    for(i=0;i<size;i++)
                    {
                        if(productid[i]==id)
                        {
                            System.out.println("Enter Quantity to add:");
                            int quantity=sc.nextInt();
                            productquantity[i]+=quantity;
                            System.out.println("Stock updated successfully!!");
                            found =true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Product not found.");
                    }
                    break;
                case 8:
                    if(size==0)
                    {
                        System.out.println("Inventory is empty!");
                        break;
                    }
                    System.out.println("Enter product ID:");
                    id=sc.nextInt();
                    found=false;
                    for(i=0;i<size;i++)
                    {
                        if(productid[i]==id)
                        {
                            System.out.println("Enter quantity to sell:");
                            int quantity=sc.nextInt();
                            if(quantity<=productquantity[i])
                            {
                                productquantity[i]-=quantity;
                                System.out.println("Product Sold Successfully!");
                            }
                            else
                            {
                                System.out.println("Insufficient stock.");
                            }
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Product not found!");

                    }
                    break;
                case 9:
                    if(size==0)
                    {
                        System.out.println("inventory is empty");
                        break;
                    }
                    double totalvalue=0;
                    for(i=0;i<size;i++)
                    {
                        totalvalue+=(productprice[i]*productquantity[i]);

                    }
                    System.out.println("Total inventory value ="+totalvalue);
                    break;
                case 10:
                    System.out.println("Exiting...Thank You!");
                    break;
                default:
                    System.out.println("Invaild choice! Please try again.");
            }
        }
        sc.close();
    }
}