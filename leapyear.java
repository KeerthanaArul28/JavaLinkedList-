import java.util.Scanner;
public class leapyear {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int n=sc.nextInt();
        if(n%4==0||n%400==0&&n%100!=0)
        {
            System.out.println(n+ "is leap year");
        }
        else
        {
            System.out.println(n+"is not leap year");
        }

        }
    }
    //output:
/*
Enter the year
2004
2004is leap year
 * 
 */
