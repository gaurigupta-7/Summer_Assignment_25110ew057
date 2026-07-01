import java.util.*;
public class ques117
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int roll[]=new int[100];
        String names[]=new String[100];
        int marks[]=new int[100];
        int count=0;
        int choice=0;
        int i;
        while(choice!=4)
        {
            System.out.println("=============STUDENT RECORD SYSTEM================");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(count==100)
                    {
                        System.out.println("Record if full!");
                        break;
                    }
                    System.out.println("Enter roll number:");
                    int newroll=sc.nextInt();
                    i=0;
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
                        System.out.println("roll number already exists!");
                        break;
                    }
                    roll[count]=newroll;
                    sc.nextLine();
                    System.out.println("Enter student name:");
                    names[count]=sc.nextLine();
                    System.out.println("Enter student marks:");
                    marks[count]=sc.nextInt();
                    count++;
                    System.out.println("\nStudent Added successfully!!");
                    break;
                case 2:
                    if(count==0)
                    {
                        System.out.println("No student record found!");
                        break;
                    }
                    System.out.println("\n--------------------------------------------");
                    System.out.println("Roll no\tName\tMarks\tGrade");
                    System.out.println("-----------------------------------------------");
                    i=0;
                    while(i<count)
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
                        System.out.println(roll[i]+"\t"+names[i]+"\t"+marks[i]+"\t"+grade);
                        i++;
                    }
                        System.out.println("----------------------------------------");
                        break;
                case 3:
                        System.out.println("Enter Roll Number to search:");
                        int searchroll=sc.nextInt();
                        i=0;
                        boolean found=false;
                        while(i<count)
                        {
                            if(roll[i]==searchroll)
                            {String grade;
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
                        System.out.println("\nStudent Found ");
                        System.out.println("Roll Number :"+roll[i]);
                        System.out.println("Name        :"+names[i]);
                        System.out.println("Marks       :"+marks[i]);
                        System.out.println("Grade       :"+grade);
                        found=true;
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
                    System.out.println("\nThank You for Using Student Record System");
                    break;
                default:
                    System.out.println("invalid choice! Please try Again.");


            }
        }
        sc.close();
    }
}