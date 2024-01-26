import java.io.*;
import java.util.*;
class triangel
{
    int n,i,k,j,p;
    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.print("Enter number of line for Pascal triangel:");
        n=sc.nextInt();
    }
    void calculate()
    {
        for(i=1;i<=n;i++)
        {
            for(k=i;k<=n-1;k++)
            {
              System.out.print(" ");
            }
            for(j=1;j<=i;j++)
               {
                if(j==1)
                 {  p=1;
                    System.out.print(p+" ");
                 }
                else
                  {  p=(p*(i-j+1)/(j-1));
                     System.out.print(p+" ");
                  }  
               }
            System.out.println(" ");
            
        }
    }
}
class pascaltriangel
{
     public static void main(String args[])
     {
        triangel obj= new triangel();
        obj.input();
        obj.calculate();
     }
}