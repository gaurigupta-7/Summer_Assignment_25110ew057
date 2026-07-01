import java.util.*;
public class ques110
{
    static String getstatus(double balance)
    {
        if(balance>=1000)
        {
            return "Active";
        }
        else{
            return "Low Balance";
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int accno[]=new int[100];
        String holdername[]=new String[100];
        double balance[]=new double[100];
        int transact[]=new int[100];
        int count=0;
        int choice=0;

        while(choice!=8)
        {
            System.out.println("\n=================================================");
            System.out.println("         BANK ACCOUNT SYSTEM");
            System.out.println("====================================================");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Transfer Money");
            System.out.println("7. Bank Summary");
            System.out.println("8. Exit");
            System.out.println("=====================================================");
            System.out.println("Enter Your Choice");
            choice =sc.nextInt();

            switch(choice)
            {
                case 1:
                   if(count==100)
                   {
                    System.out.println("Bank Record is Full!!");
                    break;
                   }
                   System.out.println("Enter Account Number:");
                   int newacc=sc.nextInt();
                   int i=0;
                   boolean exists=false;
                   while(i<count)
                   {
                    if(accno[i]==newacc)
                    {
                        exists=true;
                        break;
                    }
                    i++;
                   }
                   if(exists)
                   {
                    System.out.println("Account Number Already Exists!");
                    break;
                   }
                   accno[count]=newacc;
                   sc.nextLine();
                   System.out.println("Enter Account Holder Name:");
                   holdername[count]=sc.nextLine();
                   System.out.println("Enter Initial Balance:");
                   balance[count]=sc.nextDouble();
                   transact[count]=0;
                   count++;
                   System.out.println("\nAccount Created Successfully!!");
                   break;
                case 2:
                    if(count==0)
                    {
                        System.out.println("No Account Found!");
                        break;
                    }
                    System.out.println("\n=====================================================");
                    System.out.printf("%-12s %-25s %-15s %-15s %-15s\n", "Account no", "Holder Name" , "Balance" , "Status" , "Transactions");
                    System.out.println("========================================================");
                    i=0;
                    while(i<count)
                    {
                        System.out.printf("%-12d %-25s %-15.2f %-15s %-15d\n", accno[i],holdername[i], balance[i],getstatus(balance[i]),transact[i]);
                        i++;
                    }
                    System.out.println("=========================================================");
                    break;
                case 3:
                    if(count==0)
                    {
                        System.out.println("No Account Found!");
                        break;
                    }
                    System.out.println("Enter Account Number:");
                    int depositacc=sc.nextInt();
                    i=0;
                    boolean depositfound=false;
                    while(i<count)
                    {
                        if(accno[i]==depositacc)
                        {
                            System.out.printf("Current Balance :%.2f\n",balance[i]);
                            System.out.println("Enter Deposit amount:");
                            double depositamt=sc.nextDouble();
                            balance[i]+=depositamt;
                            transact[i]++;
                            System.out.println("\nAmount Deposit Successfully!!");
                            System.out.printf("Updated Balance: %.2f\n",balance[i]);
                            depositfound=true;
                            break;
                        }
                        i++;
                        
                    }
                    if(!depositfound)
                    {
                        System.out.println("Account Not Found!");
                    }
                    break;
                case 4:
                    if(count==0)
                    {
                        System.out.println("Account Not Found!");
                        break;
                    }
                    System.out.println("Enter Account Number:");
                    int withdrawacc=sc.nextInt();
                    i=0;
                    boolean withdrawfound=false;
                    while(i<count)
                    {
                        if(accno[i]==withdrawacc)
                        {
                            System.out.printf("Current Balance  :%.2f\n",balance[i]);
                            System.out.println("Enter Withdraw amount :");
                            double withdrawamt=sc.nextDouble();
                            if(withdrawamt>balance[i])
                            {
                                System.out.println("Insufficient Balance!");
                            }
                            else if(balance[i]-withdrawamt<500)
                            {
                                System.out.println("Minimum Balance of 500 must be maintained!");
                            }
                            else
                            {
                                balance[i]-=withdrawamt;
                                transact[i]++;
                                System.out.println("\nAmount Withdrawn Successfully!!");
                                System.out.printf("Remaining Balance:%.2f\n",balance[i]);
                            }
                            withdrawfound=true;
                            break;
                        }
                        i++;
                    }
                    if(!withdrawfound)
                    {
                        System.out.println("Account Not Found!!");
                    }
                    break;
                case 5:
                    if(count==0)
                    {
                        System.out.println("No Account Found!!");
                        break;

                    }
                    System.out.println("Enter Account Number:");
                    int searchacc=sc.nextInt();
                    i=0;
                    boolean found = false;
                    while(i<count)
                    {
                        if(accno[i]==searchacc)
                        {
                            System.out.println("\n========================================================");
                            System.out.println("                 ACCOUNT DETAILS");
                            System.out.println("==========================================================");
                            System.out.println("Account Number:"+accno[i]);
                            System.out.println("Holder Name:"+holdername[i]);
                            System.out.printf("Balance :%.2f\n",balance[i]);
                            System.out.println("Status :"+getstatus(balance[i]));
                            System.out.println("Transactions :"+transact[i]);
                            System.out.println("==========================================================");
                            found=true;
                            break;
                        }
                        i++;
                    }
                    if(!found)
                    {
                        System.out.println("Acoount Not Found!");
                    }
                    break;
                case 6:
                    if(count==0)
                    {
                        System.out.println("No Account Found!");
                        break;
                    }
                    System.out.println("Enter Sender Account Number:");
                    int senderacc=sc.nextInt();
                    System.out.println("Enter Receiver Account Number:");
                    int receiveracc=sc.nextInt();
                    int senderindex=-1;
                    int receiverindex=-1;
                    i=0;
                    while(i<count)
                    {
                        if(accno[i]==senderacc)
                        {
                            senderindex=i;
                        }
                        if(accno[i]==receiveracc)
                        {
                            receiverindex=i;
                        }
                        i++;
                    }
                    if(senderindex==-1||receiverindex==-1)
                    {
                        System.out.println("Invalid Account Number!!");
                        break;
                    }
                    System.out.println("Enter Transfer Account:");
                    double transferamt=sc.nextDouble();
                    if(transferamt>balance[senderindex])
                    {
                        System.out.println("Insufficient Balance!");
                    }
                    else if(balance[senderindex]-transferamt<500)
                    {
                        System.out.println("Minimum Balance of 500 must be maintained!!");
                    }
                    else
                    {
                        balance[senderindex]-=transferamt;
                        balance[receiverindex]+=transferamt;
                        transact[senderindex]++;
                        transact[receiverindex]++;
                        System.out.println("\nMoney Transferred Successfully");
                    }
                    break;
                case 7:
                    if(count==0)
                    {
                        System.out.println("No Account Found!");
                        break;
                    }
                    double totalbal=0;
                    double highestbal=balance[0];
                    double lowestbal=balance[0];
                    i=0;
                    while(i<count)
                    {
                        totalbal+=balance[i];
                        if(balance[i]>highestbal)
                        {
                            highestbal=balance[i];
                        }
                        if(balance[i]<lowestbal)
                        {
                            lowestbal=balance[i];
                        }
                        i++;
                    }
                    double avgbal=totalbal/count;
                    System.out.println("\n=========================================================");
                    System.out.println("             BANK SUMMARY");
                    System.out.println("===========================================================");
                    System.out.println("Total Accounts :"+count);
                    System.out.printf("Total Balance :%.2f\n",totalbal);
                    System.out.printf("Highest Balance :%.2f\n",highestbal);
                    System.out.printf("Lowest Balance :%.2f\n",lowestbal);
                    System.out.printf("Average Balance :%.2f\n",avgbal);
                    System.out.println("============================================================");
                    break;
                case 8:
                    System.out.println("\nThank You For Using Bank Account Management System");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");

            }
        }
        sc.close();
    }
}