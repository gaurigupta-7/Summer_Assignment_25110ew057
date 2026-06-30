import java.util.Scanner;
public class ques106
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int id[]=new int[100];
        double salary[]=new double[100];
        String empname[]=new String[100];
        int attendance[]=new int[100];
        String department[]=new String[100];

        int count=0;
        int choice=0;
        while(choice!=9)
        {
            System.out.println("\n=============================================================");
            System.out.println("                   EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("================================================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Total Employee");
            System.out.println("7. View Department Employee");
            System.out.println("8. Generate Salary Slip");
            System.out.println("9. Exit");
            System.out.println("================================================================");
            System.out.println("Enter your choice");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count==100)
                    {
                        System.out.println("Employee record is full!");
                        break;
                    }
                    System.out.println("Enter Employee ID : ");
                    int newid=sc.nextInt();
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
                    sc.nextLine();
                    System.out.println("Enter Employee Name : ");
                    empname[count]=sc.nextLine();
                    System.out.println("Enter Department : ");
                    department[count]=sc.nextLine();
                    System.out.println("Enter Monthly Salary : ");
                    salary[count]=sc.nextDouble();
                    System.out.println("Enter Attendence Percentage : ");
                    attendance[count]=sc.nextInt();
                    count++;
                    System.out.println("\nEmployee Added Successfully!");
                    break;
                case 2:
                    if(count==0)
                    {
                        System.out.println("No Employee Record Found !!");
                        break;
                    }
                    System.out.println("\n-----------------------------------------------------------------");
                    System.out.println("ID \t Name \t Department \t Salary \t Attendance");
                    System.out.println("--------------------------------------------------------------------");
                    i=0;
                    while(i<count)
                    {
                        System.out.println(id[i]+"\t"+empname[i]+"\t"+department[i]+"\t"+salary[i]+"\t"+attendance[i]);
                        i++;
                    }
                    System.out.println("--------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Enter Employee ID To Search");
                    int searchid=sc.nextInt();
                    i=0;
                    boolean found=false;
                    while(i<count)
                    {
                        if(id[i]==searchid)
                        {
                            System.out.println("\n===================================================================");
                            System.out.println("                         EMPLOYEE DETAILS");
                            System.out.println("=====================================================================");
                            System.out.println("Employee Id      :"+id[i]);
                            System.out.println("Employee Name    :"+empname[i]);
                            System.out.println("Department       :"+department[i]);
                            System.out.println("Monthly Salary   :"+salary[i]);
                            System.out.println("Attendance       :"+attendance[i]);
                            System.out.println("=====================================================================");
                            found=true;
                            break;
                        }
                        i++;
                    }
                    if(!found)
                    {
                        System.out.println("Employee Record Not Found !!");
                    }
                    break;
                case 4:
                    System.out.println("Enter Employee ID :");
                    int updateid=sc.nextInt();
                    i=0;
                    boolean updated=false;
                    while(i<count)
                    {
                        if(id[i]==updateid)
                        {
                            System.out.println("Current Salary :"+salary[i]);
                            System.out.println("Enter New Salary :");
                            salary[i]=sc.nextDouble();
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
                    int deleteid=sc.nextInt();
                    i=0;
                    boolean deleted=false;
                    while(i<count)
                    {
                        if(id[i]==deleteid)
                        {
                            int j=i;
                            while(j<count-1)
                            {
                                id[j]=id[j+1];
                                empname[j]=empname[j+1];
                                department[j]=department[j+1];
                                salary[j]=salary[j+1];
                                attendance[j]=attendance[j+1];
                                j++;
                            }
                            count--;
                            deleted=true;
                            System.out.println("Employee Deleted sucessfully!!");
                            break;
                        }
                        i++;
                    }
                    if(!deleted)
                    {
                        System.out.println("Employee Record Not Found!!");

                    }
                    break;
                case 6:
                    System.out.println("\n Total Employees :"+count);
                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("Enter Department Name :");
                    String depart=sc.nextLine();
                    i=0;
                    boolean depfound=false;
                    System.out.println("\n------------------------------------------------------------------------");
                    System.out.println("ID \t Name \t Salary \t Attendance");
                    System.out.println("--------------------------------------------------------------------------");
                    while(i<count)
                    {
                        if(department[i].equalsIgnoreCase(depart))
                        {
                            System.out.println(id[i]+"\t"+empname[i]+"\t"+salary[i]+"\t"+attendance[i]);
                            depfound=true;
                        }
                        i++;
                    }
                    System.out.println("---------------------------------------------------------------------------");
                    if(!depfound)
                    {
                        System.out.println("No Employees Found In "+depart+"Department.");
                    }
                    break;
                case 8:
                    System.out.println("Enter Employee ID :");
                    int slipid=sc.nextInt();
                    i=0;
                    boolean slipfound=false;
                    while(i<count)
                    {
                        if(id[i]==slipid)
                        {
                            double bonus=salary[i]*0.10;
                            double tax=salary[i]*0.05;
                            double netsalary=salary[i]+bonus-tax;
                            System.out.println("\n===========================================================");
                            System.out.println("                    EMPLOYEE SALARY SLIP");
                            System.out.println("==============================================================");
                            System.out.println("Employee ID    :"+id[i]);
                            System.out.println("Employee Name  :"+empname[i]);
                            System.out.println("Department     :"+department[i]);
                            System.out.println("Attendance     :"+attendance[i]+"%");
                            System.out.println("--------------------------------------------------------------");
                            System.out.printf("Basic Salary     :%.2f\n",salary[i]);
                            System.out.printf("Bonus (10%%)     :%.2f\n",bonus);
                            System.out.printf("Tax (5%%)        :%.2f\n",tax);
                            System.out.printf("Net Salary       :%.2f\n",netsalary);
                            System.out.println("===============================================================");
                            slipfound=true;
                            break;
                        }
                        i++;
                    }
                    if(!slipfound)
                    {
                        System.out.println("Employee Record Not Found!!");
                    }
                    break;
                case 9:
                    System.out.println("\nThank You For Using Employee Management System");
                    break;
                default:
                    System.out.println("Invaild Choice! Please Try Again");
            }
        }
        sc.close();
    }
}