import java.util.*;
public class ques108
{
    static int gettotal(int english,int maths,int science,int computer)
    {
        return english + maths + science + computer ;
    }
    static double getpercentage(int total)
    {
        return total/4.0;
    }
    static String getgrade(double percentage)
    {
        if (percentage>=90)
            return"A+";
        else if(percentage>=80)
            return "A";
        else if(percentage>=70)
            return "B";
        else if(percentage>=60)
            return "C";
        else if(percentage>=50)
            return "D";
        else
            return "F";
    }
    static String getresult(int english , int maths, int science , int computer)
    {
        if (english>=33 && maths>=33 && science>=33 && computer>=33)
            return "PASS";
        else 
            return "FAIL";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int rollno[]=new int[100];
        String name[]=new String[100];
        int english[]=new int[100];
        int maths[]=new int[100];
        int science[]=new int[100];
        int computer[]=new int[100];
        int count=0;
        int choice=0;
        while(choice!=7)
        {
            System.out.println("\n==================================================================");
            System.out.println("                    MARKSHEET GENERATION SYSTEM");
            System.out.println("====================================================================");
            System.out.println("1. Add Student Record");
            System.out.println("2. View All Records");
            System.out.println("3. Generate Marksheet");
            System.out.println("4. Update Marks");
            System.out.println("5. Class Summary");
            System.out.println("6. Class Topper");
            System.out.println("7. Exit");
            System.out.println("====================================================================");
            System.out.println("Enter your Choice");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count==100)
                    {
                        System.out.println("Record is Full!!");
                        break;
                    }
                    System.out.println("Enter roll number");
                    int newrollno=sc.nextInt();
                    int i=0;
                    boolean exists=false;
                    while(i<count)
                    {
                        if(rollno[i]==newrollno)
                        {
                            exists=true;
                            break;
                        }
                        i++;
                    }
                    if(exists)
                    {
                        System.out.println("Roll Number Already Exists");
                        break;
                    }
                    rollno[count]=newrollno;
                    sc.nextLine();
                    System.out.println("Enter Student Name:");
                    name[count]=sc.nextLine();
                    System.out.println("Enter English Marks:");
                    english[count]=sc.nextInt();
                    System.out.println("Enter Maths Marks:");
                    maths[count]=sc.nextInt();
                    System.out.println("Enter Science Marks:");
                    science[count]=sc.nextInt();
                    System.out.println("Enter Computer Marks:");
                    computer[count]=sc.nextInt();
                    count++;
                    System.out.println("\nStudent Record Added Successfully!");
                    break;
                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Student Record Found!!");
                        break;
                    }
                    System.out.println("\n-----------------------------------------------------------------");
                    System.out.printf("%-8s %-18s %-8s %-8s %-8s %-10s %-8s %-10s %-8s %-8s\n" , "Roll" , "Name" , "Eng" , "Maths" , "Sci" , "Comp" , "Total" , "Percent" , "Grade" , "Result");
                    System.out.println("-------------------------------------------------------------------");
                    i=0;
                    while(i<count)
                    {
                        int total=gettotal(english[i],maths[i],science[i],computer[i]);
                        double percentage=getpercentage(total);
                        String grade=getgrade(percentage);
                        String result=getresult(english[i],maths[i],science[i],computer[i]);
                        System.out.printf("%-8d %-18s %-8d %-8d %-8d %-10d %-8d %-10.2f %-8s %-8s\n" , rollno[i], name[i], english[i], maths[i], science[i], computer[i], total, percentage, grade, result);
                        i++;
                    }
                    System.out.println("--------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Enter Roll Number:");
                    int searchroll=sc.nextInt();
                    i=0;
                    boolean found=false;
                    while(i<count)
                    {
                        if(rollno[i]==searchroll)
                        {
                            int total=gettotal(english[i],maths[i],science[i],computer[i]);
                            double percentage=getpercentage(total);
                            String grade=getgrade(percentage);
                            String result=getresult(english[i],maths[i],science[i],computer[i]);
                            System.out.println("\n======================================================================");
                            System.out.println("                          STUDENT MARKSHEET");
                            System.out.println("========================================================================");
                            System.out.println("Roll number    :"+rollno[i]);
                            System.out.println("Student name   :"+name[i]);
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("English       :"+english[i]);
                            System.out.println("Maths        :"+maths[i]);
                            System.out.println("Science      :"+science[i]);
                            System.out.println("Computer     :"+computer[i]);
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("Total Marks   :"+total+"/400");
                            System.out.printf("Percentage     :%.2f%%\n" , percentage);
                            System.out.println("Grade       :"+grade);
                            System.out.println("Result     :"+result);
                            System.out.println("===========================================================================");
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
                    System.out.println("Enter Roll Number:");
                    int updateroll=sc.nextInt();
                    i=0;
                    boolean updated=false;
                    while(i<count)
                    {
                        if(rollno[i]==updateroll)
                        {
                            System.out.println("Current Marks");
                            System.out.println("English     :"+english[i]);
                            System.out.println("Maths   :"+maths[i]);
                            System.out.println("Science     :"+science[i]);
                            System.out.println("Computer    :"+computer[i]);
                            System.out.println("\nEnter New Marks");
                            System.out.println("English :");
                            english[i]=sc.nextInt();
                            System.out.println("Science :");
                            science[i]=sc.nextInt();
                            System.out.println("Maths :");
                            maths[i]=sc.nextInt();
                            System.out.println("Computer :");
                            computer[i]=sc.nextInt();
                            System.out.println("\nMarks Updated Successfully!!");
                            updated=true;
                            break;
                        }
                        i++;
                    }
                    if(!updated)
                    {
                        System.out.println("Student Record Not Found!!");
                    }
                    break;
                case 5:
                    if(count==0)
                    {
                        System.out.println("No Student Records Found!");
                        break;
                    }
                    int passed=0;
                    int failed=0;
                    double totalpercentage=0;
                    i=0;
                    while(i<count)
                    {
                        int total=gettotal(english[i], maths[i],science[i], computer[i]);
                        double percentage=getpercentage(total);
                        String result=getresult(english[i], maths[i],science[i], computer[i]);
                        totalpercentage += percentage;
                        if(result.equals("PASS"))
                            passed++;
                        else
                            failed++;
                        i++;
                    }
                    double averagepercentage=totalpercentage/count;
                    System.out.println("\n======================================================================");
                    System.out.println("                              CLASS SUMMARY");
                    System.out.println("========================================================================");
                    System.out.println("Total Students :"+count);
                    System.out.println("Passed        :"+passed);
                    System.out.println("Failed       :"+failed);
                    System.out.printf("Average%%        :%.2f\n",averagepercentage);
                    System.out.println("=========================================================================");
                    break;
                case 6:
                    if(count==0)
                    {
                        System.out.println("No Student Records Found!");
                        break;
                    }
                    int topperindex=0;
                    int highesttotal=gettotal(english[0], maths[0], science[0], computer[0]);
                    i=1;
                    while(i<count)
                    {
                        int total=gettotal(english[i], maths[i], science[i], computer[i]);
                        if(total>highesttotal)
                        {
                            highesttotal=total;
                            topperindex=i;
                        }
                        i++;
                    }
                    double topperpercentage=getpercentage(highesttotal);
                    String toppergrade=getgrade(topperpercentage);
                    String topperresult=getresult(english[topperindex], maths[topperindex], science[topperindex], computer[topperindex]);
                    System.out.println("\n=============================================================================");
                    System.out.println("                                 CLASS TOPPER");
                    System.out.println("===============================================================================");
                    System.out.println("Roll Number   :"+rollno[topperindex]);
                    System.out.println("Name          :"+name[topperindex]);
                    System.out.println("Total Marks  :"+highesttotal+"/400");
                    System.out.printf("Percentage    :%.2f%%\n", topperpercentage);
                    System.out.println("Grade       :"+toppergrade);
                    System.out.println("Result    :"+topperresult);
                    System.out.println("================================================================================");
                    break;
                case 7:
                    System.out.println("\nThank You for Using Marksheet Generation System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please Try Again.");
            }
        }
        sc.close();
    }
}