import java.util.*;
public class ques101
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("guess anumber between 1 to 100");
        int num=rand.nextInt(100)+1;
        int c=0,guess;
        do
        {
            System.out.println("Enter the number");
            guess=sc.nextInt();
            c++;
            if(guess>num)
            {
                System.out.println("Too high");
            }
            else if(guess<num)
            {
                System.out.println("Too low");
            }
            else
            {
                System.out.println("Correct guess\n You guessed after "+c+" attempts");
            }
        }while(num!=guess);
            sc.close();
    }
}