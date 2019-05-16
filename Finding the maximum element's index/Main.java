
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++)
    {
      a[i]= in.nextInt();
      
    }
    int temp= 0;
    for(int i=0;i<n;i++)
    {
       if(a[i]>temp)
         temp=a[i];
    }
     for(int i=0;i<n;i++)
     {
       if(temp==a[i])
       
      System.out.println(i);
     }
   
  }
  }
