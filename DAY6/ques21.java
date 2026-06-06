package DAY6;
import java.util.Scanner;
public class ques21 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number to find the binary of");
        int n=sc.nextInt();
        int t=n;
        String binary = "";
        while(n!=0)
        {
            binary = (n%2) + binary;
            n = n/2;
        }
        System.out.println("The binary of the given number "+t+" is "+binary);
        sc.close();
    }
}
