import java.util.*;
public class ques104
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int score=0;
        int ans;
        
        System.out.println("======QUIZ=====");
        System.out.println("Q1. What is the capital of India?");
        System.out.println("1. Mumbai \n  2. Delhi \n 3. Kolkata");
        System.out.println("Enter your answer");
        ans=sc.nextInt();
        if(ans==2)
        {
            score++;
        }
        System.out.println("Q2. How many days are there in a week?");
        System.out.println("1. 5 \n 2. 9 \n 3. 7");
        System.out.println("Enter your answer");
        ans=sc.nextInt();
        if(ans==3)
        {
            score++;
        }
        System.out.println("Q3. Which language is used for Android development?");
        System.out.println("1. Java \n 2. Python \n 3. C");
        System.out.println("Enter your answer");
        ans=sc.nextInt();
        if(ans==1)
        {
            score++;
        }
        System.out.println("=====RESULT=====");
        System.out.println("Your result : "+score);
        if(score==3)
        {
            System.out.println("Excellent");
        }
        else if(score==2)
        {
            System.out.println("good");
        }
        else
        {
            System.out.println("keep practicing");
        }
        sc.close();
    }
}