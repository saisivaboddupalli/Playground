import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	  Scanner in =new Scanner(System.in);
        int n = in.nextInt();
      int k=1;
      for( int i=1;i<=n;i++)
      {
    for(k=1;k<=n-i;k++)
           {
          System.out.print(" ");
   
           }
    for(int j=1;j<=2*i-1;j++)
    {
      System.out.print("*");
    }
    System.out.print("\n");  
      }   
	}
}