import java.util.Scanner;
class Main{
  public static int sum(int a)
  {
    int b=0;
    for(int i=1;i<=a;i++)
    {
      b+=i;
    }
    
    return b;
  }
	public static void main (String[] args){
	 Scanner in =new Scanner(System.in);
      int n=in.nextInt();
     int s=sum(n);
      System.out.println(s);
	}
}