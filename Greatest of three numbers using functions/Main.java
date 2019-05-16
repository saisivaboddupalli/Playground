import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
     int n2=in.nextInt();
      int n3=in.nextInt();
    int s=g(n1,n2,n3);
      System.out.println(s);
	}
  public static int g(int a, int b,int c)
  {int g;
    if((a>b)&&(a>c))
    {
      g = a;
      
    }
    else
      if(b>c)
      g =b;
    else 
      g =c;
    return g;
  }
}
