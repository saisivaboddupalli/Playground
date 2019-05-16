import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
    int n = in.nextInt();
      int i;
      int sum=1;
      int a=1;
      for(i=1;i<=n;i++)
      {
        a =a*i;
      }
      System.out.println(a);
      // Type your code here
	}
}