import java.util.*;
public class ques113
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        int num1,num2;
        while(choice!=9)
        {
            System.out.println("==================MINI CALCULATOR=================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square");
            System.out.println("8. Sqaure root");
            System.out.println("9. Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter First number:");
                    num1=sc.nextInt();
                    System.out.println("Enter Second Number:");
                    num2=sc.nextInt();
                    System.out.println("Answer ="+(num1+num2));
                    break;
                case 2:
                    System.out.println("Enter first number:");
                    num1=sc.nextInt();
                    System.out.println("Enter second number:");
                    num2=sc.nextInt();
                    System.out.println("Answer ="+(num1-num2));
                    break;
                case 3:
                    System.out.println("Enter First number:");
                    num1=sc.nextInt();
                    System.out.println("Enter second Number:");
                    num2=sc.nextInt();
                    System.out.println("Answer ="+(num1*num2));
                    break;
                case 4:
                    System.out.println("Enter first number:");
                    num1=sc.nextInt();
                    System.out.println("Enter second number:");
                    num2=sc.nextInt();
                    if(num2!=0)
                        System.out.println("Answer ="+((double)num1/num2));
                    else
                        System.out.println("Cannot divide by 0.");
                    break;
                case 5:
                    System.out.println("Enter first number:");
                    num1=sc.nextInt();
                    System.out.println("Enter second number:");
                    num2=sc.nextInt();
                    if(num2!=0)
                        System.out.println("Answer ="+(num1%num2));
                    else
                        System.out.println("Cannot perform modulus");
                    break;
                case 6:
                    System.out.println("Enter base:");
                    num1=sc.nextInt();
                    System.out.println("Enter exponent:");
                    num2=sc.nextInt();
                    System.out.println("Answer ="+Math.pow(num1,num2));
                    break;
                case 7:
                    System.out.println("Enter a number:");
                    num1=sc.nextInt();
                    System.out.println("Square = "+(num1*num1));
                    break;
                case 8:
                    System.out.println("Enter a number:");
                    num1=sc.nextInt();
                    if(num1>=0)
                        System.out.println("Square Root ="+Math.sqrt(num1));
                    else
                        System.out.println("Square root of a negative number is not possible");
                    break;
                case 9:
                    System.out.println("Calculator closed.");
                    break;
                default:
                    System.out.println("Invalid choice! Please Try Again.");
            }
        }
        sc.close();
    }
}