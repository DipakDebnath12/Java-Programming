import java.io.*;
import java.util.*;
class strong
{
     int n,p,i,r,s=0;
     Scanner sc=new Scanner(System.in);

    void input()
    {
       System.out.print("Enter a number for check to armstrong or not :");
       n=sc.nextInt();
    }
    void calculate()
    {
        p=n;
        while(p>0)
        {
          r=p%10;
          s=s+(r*r*r);
          p=p/10;
        } 

    }
    void display()
    {
        if(n==s)
        System.out.print("The given number is armstrong.");
        else
        System.out.println("The given number is not armstrong");
    }
}
class armstrong
{
    public static void main(String args[])
    { 
       strong obj= new strong();
       obj.input();
       obj.calculate();
       obj.display();
    }
}