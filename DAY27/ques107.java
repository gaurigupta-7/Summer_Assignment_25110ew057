import java.util.Scanner;
public class ques107
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int id[]=new int[100];
        String empname[]=new String[100];
        double basesalary[]=new double[100];
        int count=0;
        int choice=0;
        while(choice!=8)
        {
            System.out.println("\n=================================================================");
            System.out.println("                     SALARY MANAGEMENT SYSTEM");
            System.out.println("====================================================================");
            System.out.println("1. Add Salary Record");
            System.out.println("2. View Salary Records");
            System.out.println("3. Generate Salary Slip");
            System.out.println("4. Update Basic Salary");
            System.out.println("5. Bonus Calculator");
            System.out.println("6. Payroll Summary");
            System.out.println("7. Highest Net Salary");
            System.out.println("8. Exit");
            System.out.println("====================================================================");
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count==100)
                    {
                        System.out.println("Salary Record Is Full!!");
                        break;
                    }
                    System.out.println("Enter Employee ID :");
                    int newid=sc.nextInt();
                    sc.nextLine();
                    int i=0;
                    boolean exists=false;
                    while(i<count)
                    {
                        if(id[i]==newid)
                        {
                            exists=true;
                            break;
                        }
                        i++;
                    }
                    if(exists)
                    {
                        System.out.println("Employee ID Already Exists!");
                        break;
                    }
                    id[count]=newid;
                    sc.nextInt();
                    System.out.println("Enter Employee Name :");
                    empname[count]=sc.nextLine();
                    System.out.println("Enter Basic Salary :");
                    basesalary[count]=sc.nextDouble();
                    count++;
                    System.out.println("\nSalary Record Added Successfully!");
                    break;
                case 2:
                    if(count==0)
                    {
                        System.out.println("No Salary Record Found!!");
                        break;
                    }
                    System.out.println("\n------------------------------------------------------------------");
                    System.out.printf("%-8s %-20s %-12s %-12s %-12s %-12s %-12s\n","ID","Name","Basic","HRA","DA","Tax","Net");
                    System.out.println("---------------------------------------------------------------------");
                    i=0;
                    while(i<count)
                    {
                        double hra=basesalary[i]*0.20;
                        double da=basesalary[i]*0.10;
                        double tax=basesalary[i]*0.05;
                        double netsalary=basesalary[i]+hra+da-tax;
                        System.out.printf("%-8d %-20s %-12.2f %-12.2f %-12.2f %-12.2f %-12.2f\n",id[i],empname[i],basesalary[i],hra,da,tax,netsalary);
                        i++;
                    }
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Enter Employee ID :");
                    int slipid=sc.nextInt();
                    i=0;
                    boolean found=false;
                    while(i<count)
                    {
                        if(id[i]==slipid)
                        {
                            double hra=basesalary[i]*0.20;
                            double da=basesalary[i]*0.10;
                            double tax=basesalary[i]*0.05;
                            double netsalary=basesalary[i]+hra+da-tax;
                            System.out.println("\n===============================================================");
                            System.out.println("                    EMPLOYYE MANAGEMENT SYSTEM");
                            System.out.println("==================================================================");
                            System.out.println("Employee ID    :"+id[i]);
                            System.out.println("Employee Name  :"+empname[i]);
                            System.out.println("----------------------------------------------------------------------");
                            System.out.printf("Basic Salary    :%.2f\n",basesalary[i]);
                            System.out.printf("HRA             :%.2f\n",hra);
                            System.out.printf("DA              :%.2f\n",da);
                            System.out.printf("Tax             :%.2f\n",tax);
                            System.out.printf("Net Salary      :%.2f\n",netsalary);
                            System.out.println("=========================================================================");
                            found = true;
                            break;
                        }
                        i++;
                    }
                    if(!found)
                    {
                        System.out.println("Employee Record Not Found!!");
                    }
                    break;
                case 4:
                    System.out.println("Enter Employee ID :");
                    int updateid=sc.nextInt();
                    i=0;boolean updated=false;
                    while(i<count)
                    {
                        if(id[i]==updateid)
                        {
                            System.out.printf("Current Basic Salary :%.2f\n",basesalary[i]);
                            System.out.println("Enter New Basic Salary");
                            basesalary[i]=sc.nextDouble();
                            System.out.println("Salary Updated Successfully!!");
                            updated=true;
                            break;
                        }
                        i++;
                    }
                    if(!updated)
                    {
                        System.out.println("Employee Record Not Found!!");
                    }
                    break;
                case 5:
                    System.out.println("Enter Employee ID :");
                    int bonusid=sc.nextInt();
                    i=0;
                    boolean bonusfound=false;
                    while(i<count)
                    {
                        if(id[i]==bonusid)
                        {
                            double bonus;
                            if(basesalary[i]>=100000)
                                bonus=basesalary[i]*0.15;
                            else if(basesalary[i]>=70000)
                                bonus=basesalary[i]*0.10;
                            else if(basesalary[i]>=50000)
                                bonus=basesalary[i]*0.07;
                            else
                                bonus=basesalary[i]*0.05;
                            System.out.println("\n=========================================================");
                            System.out.println("                      BONUS DETAILS");
                            System.out.println("===========================================================");
                            System.out.println("Employee ID   :"+id[i]);
                            System.out.println("Employee Name    :"+empname[i]);
                            System.out.printf("Basic Salary   :%.2f\n",basesalary[i]);
                            System.out.printf("Basic Amount   :%.2f\n",bonus);
                            System.out.println("============================================================");
                            bonusfound=true;
                            break;
                        }
                        i++;

                    }
                    if(!bonusfound)
                    {
                        System.out.println("Employee Record Not Found!!");
                    }
                    break;
                case 6:
                    if(count==0)
                    {
                        System.out.println("Employee Record Not Found");
                        break;
                    }
                    double totalpayroll=0;
                    double highestsal=basesalary[0]+(basesalary[0]*0.02)+(basesalary[0]*0.10)-(basesalary[0]*0.05);
                    double lowestsal=highestsal;
                    i=0;
                    while(i<count)
                    {
                        double hra=basesalary[i]*0.20;
                        double da=basesalary[i]*0.10;
                        double tax=basesalary[i]*0.05;
                        double netsalary=basesalary[i]+hra+da-tax;
                        totalpayroll+=netsalary;
                        if(netsalary>highestsal)
                        {
                            highestsal=netsalary;
                        }
                        if(netsalary<lowestsal)
                        {
                            lowestsal=netsalary;
                        }
                        i++;
                    }
                    double avgsalary=totalpayroll/count;
                    System.out.println("\n==============================================================");
                    System.out.println("                     PAYROLL SUMMARY");
                    System.out.println("================================================================");
                    System.out.println("Toatl Employees : "+count);
                    System.out.printf("Total Payroll : %.2f\n",totalpayroll);
                    System.out.printf("Average Salary : %.2f\n",avgsalary);
                    System.out.printf("Highest Salary : %.2f\n",highestsal);
                    System.out.printf("Lowest Salary : %.2f\n",lowestsal);
                    System.out.println("================================================================");
                    break;
                case 7:
                    if(count==0)
                    {
                        System.out.println("No Salary Records Found!!");
                        break;
                    }
                    int highestindex=0;
                    double maxnetsalary=basesalary[0]+(basesalary[0]*0.10)-(basesalary[0]*0.05);
                    i=1;
                    while(i<count)
                    {
                        double hra=basesalary[i]*0.20;
                        double da=basesalary[i]*0.10;
                        double tax=basesalary[i]*0.05;
                        double netsalary=basesalary[i]+hra+da-tax;
                        if(netsalary>maxnetsalary)
                        {
                            maxnetsalary=netsalary;
                            highestindex=i;
                        }
                        i++;
                    }
                    System.out.println("\n=====================================================");
                    System.out.println("                 HIGHEST NET SALARY");
                    System.out.println("========================================================");
                    System.out.println("Employee ID    :"+id[highestindex]);
                    System.out.println("Employee Name  :"+empname[highestindex]);
                    System.out.printf("Net Salary   : %.2f\n",maxnetsalary);
                    System.out.println("==========================================================");
                    break;
                case 8:
                    System.out.println("\nThank You for Using Salary Management System!!");
                    break;
                default:
                    System.out.println("Invaild Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}