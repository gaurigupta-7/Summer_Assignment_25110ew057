public class ques13
{
    public static void main(String[] args)
    {
        System.out.println("Generating 10 terms of fibonacci series:");
        int first,second, third, i;
        first= -1;
        second=1;
        
        for (i=1;i<=10;i++)
        {
            third=first+second;
            System.out.println(third);
            first=second;
            second=third;
        }
        System.out.println("10 terms generated");
    }
}