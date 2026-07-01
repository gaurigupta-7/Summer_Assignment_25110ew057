import java.util.*;
public class ques115
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        char str[]=new char[1000];
        int len=0;

        char init[]={'H','e','l','l','o',' ','w','o','r','l','d'};
        int i,j;
        for(i=0;i<init.length;i++)
        {
            str[len]=init[i];
            len++;
        }
        int choice=-1;
        while(choice!=0)
        {
            System.out.println("============STRING OPERATIONS==============");
            System.out.println("1. Length of String");
            System.out.println("2. Uppercase");
            System.out.println("3. Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Check Palindrome");
            System.out.println("6. Concatenate String");
            System.out.println("7. Search Word");
            System.out.println("8. Replace Character");
            System.out.println("9. Count Vowel and Consonants");
            System.out.println("10. Count Words");
            System.out.println("11. Extract Substrings");
            System.out.println("12. Compare Strings");
            System.out.println("13. Remove Spaces");
            System.out.println("14. Enter New String");
            System.out.println("0. Exit");
            System.out.println("\nCurrent String :");
            for(i=0;i<len;i++)
            {
                System.out.println(str[i]);
            }
            System.out.println("\nEnter Your Choice");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.println("Length ="+len);
                    break;
                case 2:
                    for(i=0;i<len;i++)
                    {
                        if(str[i]>='a' && str[i]<='z')
                        {
                            str[i]=(char)(str[i]-32);
                        }
                    }
                    System.out.println("Uppercase :");
                    for(i=0;i<len;i++)
                    {
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    for(i=0;i<len;i++)
                    {
                        if(str[i]>='A' && str[i]<='Z')
                        {
                            str[i]=(char)(str[i]+32);
                        }
                    }
                    System.out.println("Lowercase :");
                    for(i=0;i<len;i++)
                    {
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 4:
                    for(i=0,j=len-1;i<j;i++,j--)
                    {
                        char temp=str[i];
                        str[i]=str[j];
                        str[j]=temp;
                    }
                    System.out.println("Reversed String :");
                    for(i=0;i<len;i++)
                    {
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 5:
                    char lower[]=new char[len];
                    for(i=0;i<len;i++)
                    {
                        if(str[i]>='A' && str[i]<='Z')
                        {
                            lower[i]=(char)(str[i]+32);
                        }
                        else
                        {
                            lower[i]=str[i];
                        }
                    }
                    boolean palindrome=true;
                    for(i=0,j=len-1;i<j;i++,j--)
                    {
                        while(i<j && lower[i]==' ')
                        {
                            i++;
                        }
                        while(i<j && lower[j]==' ')
                        {
                            j--;
                        }
                        if(lower[i]!=lower[j])
                        {
                            palindrome=false;
                            break;
                        }
                    }
                    if(palindrome)
                    {
                        System.out.println("String is a palindrome");
                    }
                    else
                    {
                        System.out.println("String is not a palindrome");
                    }
                    break;
                case 6:
                    System.out.println("Enter string to concatenate :");
                    char input[]=sc.nextLine().toCharArray();
                    if(len>0 && str[len-1]!=' ' && len<str.length)
                    {
                        str[len]=' ';
                        len++;
                    }
                    for(i=0;i<input.length && len<str.length;i++)
                    {
                        str[len]=input[i];
                        len++;
                    }
                    System.out.println("After Concatenation :");
                    for(i=0;i<len;i++)
                    {
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Enter word to search:");
                    char word[]=sc.nextLine().toCharArray();
                    boolean found=false;
                    for(i=0;i<word.length;i++)
                    {
                        for(j=0;j<word.length;j++)
                        {
                            if(str[i+j]!=word[j])
                            {
                                break;
                            }
                        }
                        if(j==word.length)
                        {
                            System.out.println("word found at index "+i);
                            found=true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Word not found!");
                    }
                    break;
                case 8:
                    System.out.println("Enter Character to replace:");
                    char oldchar=sc.nextLine().charAt(0);
                    System.out.println("Enter new character :");
                    char newchar=sc.nextLine().charAt(0);
                    int count=0;
                    for(i=0;i<len;i++)
                    {
                        if(str[i]==oldchar)
                        {
                            str[i]=newchar;
                            count++;
                        }
                    }
                    System.out.println(count+"replacement made.");
                    System.out.println("Updated String :");
                    for(i=0;i<len;i++)
                    {
                        System.out.print(str[i]);

                    }
                    System.out.println();
                    break;
                case 9:
                    int vowels=0;int consonants=0;
                    for(i=0;i<len;i++)
                    {
                        char ch=str[i];
                        if(ch>='A' && ch<='Z')
                        {
                            ch=(char)(ch+32);
                        }
                        if(ch>='a' && ch<='z')
                        {
                            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                            {
                                vowels++;
                            }
                            else
                            {
                                consonants++;
                            }
                        }
                    }
                    System.out.println("Vowels= "+vowels);
                    System.out.println("Consonants ="+consonants);
                    break;
                case 10:
                    if(len==0)
                    {
                        System.out.println("String is empty!");
                        break;
                    }
                    int wordcount=0;
                    boolean inword=false;
                    for(i=0;i<len;i++)
                    {
                        if(str[i]!=' ')
                        {
                            if(!inword)
                            {
                                wordcount++;
                                inword=true;
                            }
                        }
                        else
                        {
                            inword=false;
                        }
                    }
                    System.out.println("Word COunt="+wordcount);
                    break;
                case 11:
                    System.out.println("Enter Start index:");
                    int start=sc.nextInt();
                    System.out.println("Enter end index:");
                    int end=sc.nextInt();
                    sc.nextLine();
                    if(start<0||end>len||start>end)
                    {
                        System.out.println("invalid index.");
                    }
                    else
                    {
                        System.out.println("SubString : ");
                        for(i=start;i<end;i++)
                        {
                            System.out.print(str[i]);
                        }
                        System.out.println();
                    }
                    break;
                case 12:
                    System.out.println("Enter string to compare:");
                    char other[]=sc.nextLine().toCharArray();
                    boolean equal=true;
                    if(len!=other.length)
                    {
                        equal=false;
                    }
                    else
                    {
                        for(i=0;i<len;i++)
                        {
                            if(str[i]!=other[i])
                            {
                                equal=false;
                                break;
                            }
                        }
                    }
                    if(equal)
                    {
                        System.out.println("Strings are equal");
                    }
                    else
                    {
                        System.out.println("Strings are not equal");
                    }
                    break;
                case 13:
                    char result[]=new char[1000];
                    int newlen=0;
                    for(i=0;i<len;i++)
                    {
                        if(str[i]!=' ')
                        {
                            result[newlen]=str[i];
                            newlen++;
                        }
                    }
                    len=newlen;
                    for(i=0;i<len;i++)
                    {
                        str[i]=result[i];
                    }
                    System.out.println("updated string");
                    for(i=0;i<len;i++)
                    {
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 14:
                    System.out.println("ENter new string:");
                    char newinput[]=sc.nextLine().toCharArray();
                    len=0;
                    for(i=0;i<newinput.length;i++)
                    {
                        str[i]=newinput[i];
                        len++;
                    }
                    System.out.println("String updated successfully!!");
                    break;
                case 0:
                    System.out.println("Exiting...Thank YOU!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}