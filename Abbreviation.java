import java.io.*;                                  
import java.util.*;

class A
{
    int i,k;
    String name;
    Scanner sc=new Scanner(System.in);
   
    void abb()
    {
         int i,k;
        String name;
        System.out.print("Enter a name :");
        name=sc.nextLine();
        k=0;
        for(i=name.length()-1;i>=0;i--)
        {
            if(name.charAt(i)==' ')
            {
                k=i;
                break;
            }
        }
        //System.out.println(k);
        System.out.print("The Abbreviation is :"+name.charAt(0)+".");
        for(i=0;i<k-1;i++)
        {
            if(name.charAt(i)==' ')
            {
                System.out.print(name.charAt(i+1)+".");
            }
        }
        for(i=k+1;i<=name.length()-1;i++)
        {
            System.out.print(name.charAt(i));
        }
    }      
}
class Abbreviation extends A
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.abb();
    }
}