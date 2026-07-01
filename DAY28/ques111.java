import java.util.*;
public class ques111
{
    static String getcoachtype(int choice)
    {
        if(choice ==1)
        {
            return "Sleeper";
        }
        else if(choice==2)
            return "AC 3 Tier";
        else if(choice ==3)
            return "AC 2 Tier";
        else if(choice ==4)
            return "First AC";
        else
            return "Unknown";
    }
    static double getfare(int choice)
    {
        if(choice==1)
            return 500;
        else if(choice==2)
            return 1000;
        else if(choice ==3)
            return 1500;
        else if(choice ==4)
            return 2500;
        else 
            return 0;
    }
    static String getstatus(boolean cancelled)
    {
        if(cancelled)
            return "Cancelled";
        else
            return "Confirmed";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int trainno[]=new int[100];
        String trainname[]=new String[100];
        String source[]=new String[100];
        String desti[]=new String[100];
        String rundays[]=new String[100];
        int availableseats[]=new int[100];
        String deptime[]=new String[100];
        int pnr[]=new int[100];
        String passname[]=new String[100];
        int bookedtno[]=new int[100];
        int bookedtindex[]=new int[100];
        String coachtype[]=new String[100];
        double fare[]=new double[100];
        boolean cancelled[]=new boolean[100];
        int traincount=0;
        int bookingcount=0;
        int choice=0;

        while(choice!=9)
        {
            System.out.println("\n================================================");
            System.out.println("         TRAIN TICKET BOOKING SYSTEM");
            System.out.println("===================================================");
            System.out.println("1. Add Train");
            System.out.println("2. View All Trains");
            System.out.println("3. Search Tarin By Numbers");
            System.out.println("4. Search Train By Route");
            System.out.println("5. Book Tickets");
            System.out.println("6. Search Ticket by PNR");
            System.out.println("7. Cancel Ticket");
            System.out.println("8. Booking summary");
            System.out.println("9. exit");
            System.out.println("===================================================");
            System.out.println("Enter Your Choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(traincount==100)
                    {
                        System.out.println("Train Record is Full!");
                        break;
                    }
                    System.out.println("Enter Train Number:");
                    int newtrainno=sc.nextInt();
                    int i=0;
                    boolean exists=false;
                    while(i<traincount)
                    {
                        if(trainno[i]==newtrainno)
                        {
                            exists=true;
                            break;
                        }
                        i++;
                    }
                    if(exists)
                    {
                        System.out.println("Train number Already Exists!");
                        break;
                    }
                    trainno[traincount]=newtrainno;
                    sc.nextLine();
                    System.out.println("Enter Train Name:");
                    trainname[traincount]=sc.nextLine();
                    System.out.println("Enter source station:");
                    source[traincount]=sc.nextLine();
                    System.out.println("Enter destination station:");
                    desti[traincount]=sc.nextLine();
                    System.out.println("Enter running days:");
                    rundays[traincount]=sc.nextLine();
                    System.out.println("Enter available seats:");
                    availableseats[traincount]=sc.nextInt();
                    traincount++;
                    System.out.println("\nTrain Added Successfully!");
                    break;
                case 2:
                    if(traincount==0)
                    {
                        System.out.println("no train records found");
                        break;
                    }
                    System.out.println("============================================");
                    System.out.println("TRAIN NO \t TRAIN NAME \t SOURCE \t DESTINATION \t RUNNING DAYS \t TIME \t SEATS");
                    System.out.println("=============================================");
                    i=0;
                    while(i<traincount)
                    {
                        System.out.println(trainno[i]+"\t"+trainname[i]+"\t"+source[i]+"\t"+desti[i]+"\t"+rundays[i]+"\t"+deptime[i]+"\t"+availableseats[i]);
                        i++;

                    }
                    System.out.println("==============================================");
                    break;
                case 3:
                    if(traincount==0)
                    {
                        System.out.println("No Train records found!");
                        break;
                    }
                    System.out.println("Enter train number:");
                    int searchtrainno=sc.nextInt();
                    i=0;
                    boolean found=false;
                    while(i<traincount)
                    {
                        if(trainno[i]==searchtrainno)
                        {
                            System.out.println("\n==========================================");
                            System.out.println("       TRAIN DETAILS");
                            System.out.println("============================================");
                            System.out.println("Train Number   :"+trainno[i]);
                            System.out.println("Train name    :"+trainname[i]);
                            System.out.println("Source        :"+source[i]);
                            System.out.println("Destination   :"+desti[i]);
                            System.out.println("Running days   :"+rundays[i]);
                            System.out.println("Departure time :"+deptime[i]);
                            System.out.println("Available seats:"+availableseats[i]);
                            System.out.println("=============================================");
                            found=true;
                            break;

                        }
                        i++;
                    }
                    if(!found)
                    {
                        System.out.println("Train not found");

                    }
                    break;
                case 4:
                    if(traincount==0)
                    {
                        System.out.println("No train records found!");
                        break;
                    }
                    sc.nextLine();
                    System.out.println("Enter source station:");
                    String searchsource=sc.nextLine();
                    System.out.println("Enter destination station:");
                    String searchdesti=sc.nextLine();
                    i=0;
                    found=false;
                    System.out.println("\n===========================================");
                    System.out.println("TRAIN NO \t TRAIN NAME \t SOURCE \t DESTINATION \t RUNNING DAYS \t TIME \t SEATS");
                    System.out.println("=============================================");
                    while(i<traincount)
                    {
                        if(source[i].equalsIgnoreCase(searchsource) && desti[i].equalsIgnoreCase(searchdesti))
                        {
                            System.out.println(trainno[i]+"\t"+trainname[i]+"\t"+source[i]+"\t"+desti[i]+"\t"+rundays[i]+"\t"+deptime[i]+"\t"+availableseats[i]);
                            found =true;

                        }
                        i++;
                    }
                    System.out.println("===================================================");
                    if(!found)
                    {
                        System.out.println("No trains available for this route!");

                    }
                    break;
                case 5:
                    if(traincount==0)
                    {
                        System.out.println("No train records found!");
                        break;
                    }
                    sc.nextLine();
                    System.out.println("Enter Source Station:");
                    String booksource=sc.nextLine();
                    System.out.println("Enter Destination Station:");
                    String bookdesti=sc.nextLine();
                    int selectedindex=-1;
                    System.out.println("\nAvailable Trains");
                    System.out.println("===============================================");
                    System.out.println("TRAIN NO \t TRAIN NAME \t SOURCE \t DESTINATION \t RUNNING DAYS \t TIME \t SEATS");
                    System.out.println("================================================");
                    for(i=0;i<traincount;i++)
                    {
                        if(source[i].equalsIgnoreCase(booksource) && desti[i].equalsIgnoreCase(bookdesti) && availableseats[i]>0)
                        {
                            System.out.println(trainno[i]+"\t"+trainname[i]+"\t"+source[i]+"\t"+desti[i]+"\t"+rundays[i]+"\t"+deptime[i]+"\t"+availableseats[i]);

                        }
                    }
                    System.out.println("==========================================================");
                    System.out.println("Enter Train Number:");
                    int selectedtrainno=sc.nextInt();
                    for(i=0;i<traincount;i++)
                    {
                        if(trainno[i]==selectedtrainno)
                        {
                            selectedindex=i;
                            break;
                        }

                    }
                    if(selectedindex==-1)
                    {
                        System.out.println("Train Not Found");
                        break;
                    }
                    sc.nextLine();
                    System.out.println("Enter Passenger Name:");
                    passname[bookingcount]=sc.nextLine();
                    System.out.println("\nSelect Coach Type");
                    System.out.println("1. Sleeper ");
                    System.out.println("2. AC 3 Tier");
                    System.out.println("3. AC 2 Tier");
                    System.out.println("4. First AC");
                    System.out.println("Enter Choice:");
                    int coachchoice=sc.nextInt();
                    if(coachchoice<1 || coachchoice>4)
                    {
                        System.out.println("Invalid coach choice");
                        break;
                    }
                    pnr[bookingcount]=10000+bookingcount;
                    bookedtno[bookingcount]= trainno[selectedindex];
                    bookedtindex[bookingcount]=selectedindex;
                    coachtype[bookingcount]=getcoachtype(coachchoice);
                    fare[bookingcount]=getfare(coachchoice);
                    cancelled[bookingcount]=false;
                    availableseats[selectedindex]--;
                    System.out.println("\n=========================================");
                    System.out.println("          TICKET BOOKED");
                    System.out.println("PNR  :"+pnr[bookingcount]);
                    System.out.println("Passenger name  :"+passname[bookingcount]);
                    System.out.println("Train Number   :"+trainno[selectedindex]);
                    System.out.println("Coach Type  :"+coachtype[bookingcount]);
                    System.out.println("Train Name  :"+trainname[selectedindex]);
                    System.out.println("Fare   :rupees "+fare[bookingcount]);
                    System.out.println("=============================================");
                    bookingcount++;
                    break;
                case 6:
                    if(bookingcount==0)
                    {
                        System.out.println("No Bookings Found!");
                        break;
                    }
                    System.out.println("Enter PNR Number:");
                    int searchpnr=sc.nextInt();
                    boolean pnrfound=false;
                    for(i=0;i<bookingcount;i++)
                    {
                        if(pnr[i]==searchpnr)
                        {
                            System.out.println("\n============================================");
                            System.out.println("           TICKET DETAILS");
                            System.out.println("==============================================");
                            System.out.println("PNR   :"+pnr[i]);
                            System.out.println("Passenger Name   :"+passname[i]);
                            System.out.println("Train Number   :"+bookedtno[i]);
                            System.out.println("Train Name    :"+trainname[i]);
                            System.out.println("Source   :"+source[i]);
                            System.out.println("Destination   :"+desti[i]);
                            System.out.println("Departure Time  :"+deptime[i]);
                            System.out.println("Coach Type   :"+coachtype[i]);
                            System.out.println("Fare    :"+fare[i]);
                            System.out.println("Status   :"+getstatus(cancelled[i]));
                            System.out.println("==============================================");
                            pnrfound=true;
                            break;
                        }
                    }
                    if(!pnrfound)
                    {
                        System.out.println("PNR Not Found!!");

                    }
                    break;
                case 7:
                    if(bookingcount==0)
                    {
                        System.out.println("No Bookings Found!!");
                        break;
                    }
                    System.out.println("Enter PNR Number:");
                    int cancelpnr=sc.nextInt();
                    boolean ticketfound=false;
                    for(i=0;i<bookingcount;i++)
                    {
                        if(pnr[i]==cancelpnr)
                        {
                            if(cancelled[i])
                            {
                                System.out.println("Ticket Already Cancelled!");
                            }
                            else
                            {
                                cancelled[i]=true;
                                availableseats[bookedtindex[i]]++;
                                System.out.println("Ticket Cancelled Successfully!!");
                            }
                            ticketfound=true;
                            break;
                        }

                    }
                    if(!ticketfound)
                    {
                        System.out.println("PNR Not Found!!");
                    }
                    break;
                case 8:
                    int activetickets=0;
                    int cancelledtickets=0;
                    double totalrevenue=0;
                    for(i=0;i<bookingcount;i++)
                    {
                        if(cancelled[i])
                            cancelledtickets++;
                        else
                        {
                            activetickets++;
                            totalrevenue+=fare[i];
                        }
                    }
                    System.out.println("\n=================================================");
                    System.out.println("             BOOKING SUMMARY");
                    System.out.println("===================================================");
                    System.out.println("Total Trains   :"+traincount);
                    System.out.println("Total Bookings   :"+bookingcount);
                    System.out.println("Active Tickets   :"+cancelledtickets);
                    System.out.println("Total Revenue   :%.2f\n"+totalrevenue);
                    System.out.println("===================================================");
                    break;
                case 9:
                    System.out.println("\nThank You for Using Train Ticket Booking System!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}