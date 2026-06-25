import java.util.*;
public class ques103
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double bal=10000;
        double amt=bal;
        int ch=0;
        do{
            System.out.println("Enter your choice:");
            System.out.println("Choices are:\n 1. Check balance \n 2. Deposite money \n 3. Withdraw money \n 4. Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Your balance = "+bal);
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposited");
                    double depo=sc.nextDouble();
                    amt=amt+depo;
                    System.out.println("amount successfully deposited");
                    break;
                case 3:
                    System.out.println("Enter the amount to be withdrawn");
                    double withd=sc.nextDouble();
                    if(withd>amt)
                    {
                        System.out.println("Insufficient balance");
                    }
                    else
                    {
                        amt=amt-withd;
                        System.out.println("Withdrawn successfully");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }while(ch!=4);
        sc.close();
    }
}