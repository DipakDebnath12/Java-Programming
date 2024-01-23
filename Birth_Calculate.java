import java.io.*;
import java.util.*;
class Birth_Cal
{
    Scanner sc=new Scanner(System.in);
    int pre_d,pre_m,pre_y;
    int d,m,y;
    int a,b,c
    
    ;     //year /month /date
    void input()
    {
        //to get today's date and DOB.
        System.out.println("Enter your Date of Birth");
        System.out.print("Enter date:");
        d=sc.nextInt();
        System.out.print("Enter Month:");
        m=sc.nextInt();
        System.out.print("Enter year:");
        y=sc.nextInt();
        System.out.println("\nEnter today's Date");
        System.out.print("Enter date:");
        pre_d=sc.nextInt();
        System.out.print("Enter Month:");
        pre_m=sc.nextInt();
        System.out.print("Enter year:");
        pre_y=sc.nextInt();
    }
    void calculate()
    {

        a=(pre_y-y);
        if(pre_m<m)
        {
            b=(pre_m+12);
            b=(b-m);
            a=(a-1);
        }
        else
        {
            b=(pre_m-m);
        }
        if(pre_d<d)
        {
            c=(pre_d+30);
            c=(c-d);
            b=(b-1);
        }
        else
        {
            c=(pre_d-d);
        }

    }
    void display()
    {
        System.out.print("\n Your Age : ");
        System.out.print(c+" days "+b+" months "+a+" years ");

    }
}
class Birth_Calculate
{
    public static void main(String args[])
    {
        Birth_Cal obj=new Birth_Cal();
        obj.input();
        obj.calculate();
        obj.display();
    }
}