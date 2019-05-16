import java.util.Scanner;

class Main
{
  public static int powerExponent(int b ,int e)
  {
    int result=1;
    
    while(e!=0)
    {
      result*= b;
      --e;
      
    }
    
    return result;
    
  }
  public static void main(String[] args)
  {
    Scanner in =new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
   int s1=powerExponent(base,exponent);
    System.out.print(s1);
  
  }
}