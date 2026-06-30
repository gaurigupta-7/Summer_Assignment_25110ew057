import java.util.Scanner;
public class ques105
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int roll[]=new int[100];
        String names[]=new String[100];
        int marks[]=new int[100];
        int count=0;
        int choice=0;
        while(choice!=7)
        {
            System.out.println("\n=====================================================================");
            System.out.println("                   STUDENT RECORD MANAGEMNET SYSTEM");
            System.out.println("=======================================================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Total Student");
            System.out.println("7. Exit");
            System.out.println("========================================================================");
            System.out.println("Enter Your Choice");
            choice= sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(count==100)
                    {
                        System.out.println("Record is full");
                        break;
                    }
                    System.out.println("Enter Roll Number:");
                    int newroll=sc.nextInt();
                    int i=0;
                    boolean exists=false;
                    while(i<count)
                    {
                        if(roll[i]==newroll)
                        {
                            exists=true;
                            break;
                        }
                        i++;
                    }
                    if(exists)
                    {
                        System.out.println("Roll Number Already Exists!");
                        break;
                    }
                    roll[count]=newroll;
                    sc.nextLine();
                    System.out.println("Enter student Name: ");
                    names[count]=sc.nextLine();
                    System.out.println("Enter Student Marks:");
                    marks[count]=sc.nextInt();
                    count++;
                    System.out.println("Student Added Successfully");
                    break;
                case 2:
                    if(count==0)
                    {
                        System.out.println("No Student Record Found");
                        break;
                    }
                    System.out.println("\n------------------------------------------------------");
                    System.out.println("Roll No     Name    Marks   Grade");
                    System.out.println("--------------------------------------------------------");
                    i=0;
                    while(i<count)
                    {
                        String grade;
                        if(marks[i]>=95)
                        {
                            grade="A+";
                        }
                        else if(marks[i]>=90)
                            grade="A";
                        else if(marks[i]>=80)
                            grade="B+";
                        else if(marks[i]>=70)
                            grade="B";
                        else if(marks[i]>=60)
                            grade="C";
                        else
                            grade="F";
                        System.out.println(roll[i]+"\t"+names[i]+"\t"+marks[i]+"\t"+grade);
                        i++;
                    }
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Enter Roll Number To Search:");
                    int searchroll=sc.nextInt();
                    i=0;
                    boolean found =false;
                    while(i<count)
                    {
                        if(roll[i]==searchroll)
                        {
                            String grade;
                            if(marks[i]>=95)
                                grade="A+";
                            else if(marks[i]>=90)
                                grade="A";
                            else if(marks[i]>=80)
                                grade="B+";
                            else if(marks[i]>=70)
                                grade="B";
                            else if(marks[i]>=60)
                                grade="C";
                            else
                                grade="F";
                            System.out.println("\nStudent Found");
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("Roll Number : "+roll[i]);
                            System.out.println("Name        : "+names[i]);
                            System.out.println("Marks       : "+marks[i]);
                            System.out.println("Grade       : "+grade);
                            found = true;
                            break;
                        }
                        i++;
                    }
                    if(!found)
                    {
                        System.out.println("Student Record Not Found!");
                    }
                    break;
                case 4:
                    System.out.println("Enter the Roll Number :");
                    int updateroll=sc.nextInt();
                    i=0;
                    boolean updated=false;
                    while(i<count)
                    {
                        if(roll[i]==updateroll)
                        {
                            System.out.println("Current Marks : "+marks[i]);
                            System.out.println("Enter new Marks:");
                            marks[i]=sc.nextInt();
                            System.out.println("Record Updated Successfully");
                            updated=true;
                            break;
                        }
                        i++;
                    }
                    if(!updated)
                    {
                        System.out.println("Student Record Not found!");
                    }
                    break;
                case 5:
                    System.out.println("Enter Roll Number :");
                    int deleteroll=sc.nextInt();
                    i=0;
                    boolean deleted=false;
                    while(i<count)
                    {
                        if(roll[i]==deleteroll)
                        {
                            int j=i;
                            while(j<count-1)
                            {
                                roll[j]=roll[j+1];
                                names[j]=names[j+1];
                                marks[j]=marks[j+1];
                                j++;
                            }
                            count--;
                            System.out.println("Student Record Deleted Successfully!");
                            deleted = true;
                            break;
                        }
                        i++;
                    }
                    if(!deleted)
                    {
                        System.out.println("Student Record Not Found!");
                    }
                    break;
                case 6:
                    System.out.println("\n Total Students : "+count);
                    break;
                case 7:
                    System.out.println("Thank You For Using Student Record Management System");
                    break;
                default:
                    System.out.println("Invaild Choice. Please Try Again");
            }
        }
        sc.close();
    }
}