import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in =new Scanner(System.in);
      int n= in.nextInt();
      for(int j=1;j<=n;j++)
      {
        for(int i=1;i<=n;i++)
        {
          if((i==n||i==1)||(j==1||j==n))
          {System.out.print("*");
          }
          else
          {
          System.out.print(" ");
          }   
}
        System.out.print("\n");
      } 
	}
}