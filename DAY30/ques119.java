import java.util.*;
public class ques119
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
        int i;
        while(choice!=4)
        {
            System.out.println("\n=================MINI EMPLOYEE SYSTEM==================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.println("==========================================================");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
        
        switch(choice)
        {
            case 1:
                if(count==100)
                {
                    System.out.println("Employee record is full!");
                    break;
                }
                System.out.println("Enter employee id:");
                int newid=sc.nextInt();
                i=0;
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
                    System.out.println("Employee ID already exists!");
                    break;
                }
                id[count]=newid;
                sc.nextLine();
                System.out.println("Enter employee name:");
                empname[count]=sc.nextLine();
                System.out.println("Enter department:");
                department[count]=sc.nextLine();
                System.out.println("Enter monthly salary:");
                salary[count]=sc.nextDouble();
                System.out.println("Enter attendance percentage:");
                attendance[count]=sc.nextInt();
                count++;
                System.out.println("\nEmployee added successfully!!");
                break;
            case 2:
                if(count==0)
                {
                    System.out.println("No employee record found!");
                    break;

                }
                System.out.println("\n-----------------------------------------------");
                System.out.println("ID\tName\tDepartment\tSalary\tAttendance");
                System.out.println("-------------------------------------------------");
                i=0;
                while(i<count)
                {
                    System.out.println(id[i]+"\t"+empname[i]+"\t"+department[i]+"\t"+salary[i]+"\t"+attendance[i]);
                    i++;
                }
                System.out.println("----------------------------------------------------");
                break;
            case 3:
                System.out.println("Enter employee ID to search:");
                int searchid=sc.nextInt();
                i=0;boolean found=false;
                while(i<count)
                {
                    if(id[i]==searchid)
                    {
                        System.out.println("\n=================EMPLOYEE DETAILS================");
                        System.out.println("Employee ID:"+id[i]);
                        System.out.println("Employee Name:"+empname[i]);
                        System.out.println("Department   :"+department[i]);
                        System.out.println("Monthly Salary :"+salary[i]);
                        System.out.println("Attendance  :"+attendance[i]);
                        found=true;
                        break;
                    }
                    i++;
                }
                if(!found)
                {
                    System.out.println("Employee record not found!!");
                }
                break;
            case 4:
                System.out.println("\nThank You for Using Mini Employee System!!");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    sc.close();
}
}