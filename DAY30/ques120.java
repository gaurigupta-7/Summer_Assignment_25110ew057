import java.util.*;
public class ques120
{
    static int addrecord(String startdate[], int cyclelength[], int perioddays[], String mood[], String symptoms[], String flowlevel[], int count,Scanner sc)
    {
        if(count==100)
        {
            System.out.println("Tracker is full!");
            return count;
        }
        System.out.println("Enter Strt date (DD-MM-YYYY)");
        String newdate=sc.nextLine();
        int i=0;
        boolean exists=false;
        while(i<count)
        {
            if(startdate[i].equals(newdate))
            {
                exists=true;
                break;
            }
            i++;
        }
        if(exists)
        {
            System.out.println("record already exists!");
            return count;
        }
        startdate[count]=newdate;
        System.out.println("Enter cycle length (days):");
        cyclelength[count]=sc.nextInt();
        System.out.println("Enter Period Duration (days):");
        perioddays[count]=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter mood:");
        mood[count]=sc.nextLine();
        System.out.println("Enter main Symptom:");
        symptoms[count]=sc.nextLine();
        System.out.println("Enter blood flow (Spotting/light/medium/heavy/very heavy):");
        flowlevel[count]=sc.nextLine();
        count++;
        System.out.println("\nCount record added successfully!!");
        return count;
    }
    static void viewrecord(String startdate[], int cyclelength[], int perioddays[], String mood[], String symptoms[], String flowlevel[], int count)
    {
        if(count==0)
        {
            System.out.println("No records Found!");
            return;
        }
        System.out.println("\n===================================================================");
        System.out.println("Start Date\tCyclee\tDuration\tMood\tSymptom\tBlood Flow");
        int i=0;
        while(i<count)
        {
            System.out.println(startdate[i]+"\t"+cyclelength[i]+"\t"+perioddays[i]+"\t"+mood[i]+"\t"+symptoms[i]+"\t"+flowlevel[i]);
            i++;
        }
        System.out.println("======================================================================");
        System.out.println("Total Records = "+count);
    }
    static void searchrecord(String startdate[], int cyclelength[], int perioddays[], String mood[],String symptoms[], String flowlevel[], int count, Scanner sc)
    {
        if(count==0)
        {
            System.out.println("No records found!");
            return;
        }
        System.out.println("Enter start date(DD-MM-YYYY)  :");
        String searchdate=sc.nextLine();
        int i=0;
        boolean found=false;
        while(i<count)
        {
            if(startdate[i].equals(searchdate))
            {
                System.out.println("\n============PERIOD RECORD================");
                System.out.println("Start Date    :"+startdate[i]);
                System.out.println("Cycle Length  :"+cyclelength[i]);
                System.out.println("Period Duration:"+perioddays[i]);
                System.out.println("Mood          :"+mood[i]);
                System.out.println("Main Symptom  :"+symptoms[i]);
                System.out.println("Blood Flow    :"+flowlevel[i]);
                System.out.println("===============================================");
                found=true;
                break;
            }
            i++;
        }
        if(!found)
        {
            System.out.println("Record not found!");
        }

    }
    static void predictnextperiod(String startdate[], int cyclelength[], int count)
    {
        if(count==0)
        {
            System.out.println("record not found!");
            return;
        }
        int last=count-1;
        System.out.println("\n=========NEXT PERIOD PREDICTION===========");
        System.out.println("Last Period Start  :"+startdate[last]);
        System.out.println("Cycle length      :"+cyclelength[last]+" days");
        System.out.println();
        System.out.println("Perdicted Next Period :");
        System.out.println("Approximately after "+cyclelength[last]+" Days");
        System.out.println("(Use a calendar to find the exact date.)");
        System.out.println("=================================================");
    }
    static void avgcycle(int cyclelength[], int count)
    {
    if(count==0)
    {
        System.out.println("No records found!");
        return;
    }
    int total=0;
    int i=0;
    while(i<count)
    {
        total+=cyclelength[i];
        i++;
    }
    double avg=(double)total/count;
    System.out.println("\n============AVERAGE CYCLE LENGTH==========");
    System.out.printf("Avg cycle length  :%.2f Days\n",avg);
    if(avg>=21 && avg<=35)
    {
        System.out.println("Status:Normal Cycle");

    }
    else
        System.out.println("Status : Irregular Cycle");
    System.out.println("===============================================");
}
static void cyclechart(String startdate[], int cyclelength[], int count)
{
    if(count==0)
    {
        System.out.println("No record Found");
        return;
    }
    System.out.println("\n===============CYCLE LENGTH CHART===============");
    int i=0;
    while(i<count)
    {
        System.out.print(startdate[i]+" ");
        int j=0;
        while(j<cyclelength[i])
        {
            System.out.print("|||||");
            j++;
        }
        System.out.println(" "+cyclelength[i]+" Days");
        i++;
    }
    System.out.println("======================================================");
}
static void bloodflowsummary(String flowlevel[], int count)
{
    if(count==0)
    {
        System.out.println("No records found!");
        return;
    }
    int spotting=0;
    int light=0;
    int medium=0;
    int heavy=0;
    int veryheavy=0;
    int i=0;
    while(i<count)
    {
        if(flowlevel[i].equalsIgnoreCase("Spotting"))
            spotting++;
        else if(flowlevel[i].equalsIgnoreCase("light"))
            light++;
        else if(flowlevel[i].equalsIgnoreCase("medium"))
            medium++;
        else if(flowlevel[i].equalsIgnoreCase("heavy"))
            heavy++;
        else if(flowlevel[i].equalsIgnoreCase("very heavy"))
            veryheavy++;
        i++;
    }
    System.out.println("\n=============BLOOD FLOW SUMMARY==============");
    System.out.println("Spotting     ");
    i=0;
    while(i<spotting)
    {
        System.out.print("|||||");
        i++;
    }
    System.out.println(" "+spotting);

    System.out.println("Light    ");
    i=0;
    while(i<light)
    {
        System.out.print("|||||");
        i++;
    }
    System.out.println(" "+light);

    System.out.println("Medium    ");
    i=0;
    while(i<medium)
    {
        System.out.print("|||||");
        i++;
    }
    System.out.println(" "+medium);

    System.out.println("Heavy    ");
    i=0;
    while(i<heavy)
    {
        System.out.print("|||||");
        i++;
    }
    System.out.println(" "+heavy);

    System.out.println("Very Heavy    ");
    i=0;
    while(i<veryheavy)
    {
        System.out.print("|||||");
        i++;
    }
    System.out.println(" "+veryheavy);

    System.out.println("=======================================================");
}
static void cramptips()
{
    System.out.println("\n=========TIPS TO REDUCE CRAMPS============");
    System.out.println("1. Drink plenty of water");
    System.out.println("2. Use a heating pad");
    System.out.println("3. Eat healthy food");
    System.out.println("4. Do light exercise");
    System.out.println("5. Get enough sleep");
    System.out.println("6. Reduce caffeine");
    System.out.println("7. Consult a doctor is pain is severe.");
    System.out.println("===============================================");

}
static void healthyfood()
{
    System.out.println("\n============HEALTHY FOOD SUGGESTIONS=============");
    System.out.println("* Bananas");
    System.out.println("* Spinach");
    System.out.println("* Yogurt");
    System.out.println("* Dark Chocolate");
    System.out.println("* Nuts");
    System.out.println("* Ginger Tea");
    System.out.println("* Fish");
    System.out.println("====================================================");
}
static void motivationalquote(Random random)
{
    String quotes[]={
        "Your body is strong. Take care of it." ,
        "Every cycle is different. Be kind to yourself" ,
        "Rest is also productive" ,
        "Small self-care habits make a big difference" ,
        "You are stronger than you think" ,
        "Health come first. Always" ,
        "Keep smiling. Better days are ahead" ,
        "Take one day at a time"
    };
    int index=random.nextInt(quotes.length);
    System.out.println("\n===================================================");
    System.out.println("Thank You for Using Period Tracker!");
    System.out.println("----------------------------------------------------");
    System.out.println(quotes[index]);
    System.out.println("======================================================");
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String startdate[]=new String[100];
        int cyclelength[]=new int[100];
        int perioddays[]=new int[100];
        String mood[]=new String[100];
        String symptoms[]=new String[100];
        String flowlevel[]=new String[100];
        int count=0;
        int choice=0;

        while(choice!=10)
        {
            System.out.println("\n=====================PERIOD TRACKER SYSTEM=======================");
            System.out.println("1. Add cycle record");
            System.out.println("2. View record");
            System.out.println("3. Search record");
            System.out.println("4. Perdict next period");
            System.out.println("5. Avg cycle length");
            System.out.println("6. Cycle length chart");
            System.out.println("7. Blood flow summary");
            System.out.println("8. Tips to reduce cramps");
            System.out.println("9. Healthy food suggestions");
            System.out.println("10. Exit");
            System.out.println("====================================================================");
            System.out.println("Enter your choice::");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    count=addrecord(startdate, cyclelength, perioddays, mood, symptoms, flowlevel, count, sc);
                    break;
                case 2:
                    viewrecord(startdate, cyclelength, perioddays, mood, symptoms, flowlevel, count);
                    break;
                case 3:
                    searchrecord(startdate, cyclelength, perioddays, mood, symptoms, flowlevel, count, sc);
                    break;
                case 4:
                    predictnextperiod(startdate, cyclelength,count);
                    break;
                case 5:
                    avgcycle(cyclelength, count);
                    break;
                case 6:
                    cyclechart(startdate, cyclelength, count);
                    break;
                case 7:
                    bloodflowsummary(flowlevel, count);
                    break;
                case 8:
                    cramptips();
                    break;
                case 9:
                    healthyfood();
                    break;
                case 10:
                    motivationalquote(random);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}