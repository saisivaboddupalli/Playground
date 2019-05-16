import java.util.Scanner;
class Main
{
  public static int square(int a)
  {
    int sum=0;
    sum=a*a;
  
  return sum;
  }
  
  
	public static void main (String[] args)
    {
	 // Type your code here 
Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int s;
      s = square(n);
      System.out.println(s);
      
      
	} 
}