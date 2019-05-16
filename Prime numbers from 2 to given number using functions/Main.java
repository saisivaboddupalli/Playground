import java.util.Scanner;
class Main{
	public static void main (String[] args){
     Scanner in =new Scanner(System.in);
      int n =in.nextInt();
      int low =2;
      int f;
      while (low < n)
    {
        f = 0;

        for(int i = 2; i <= low/2; ++i)
        {
            if(low % i == 0)
            {
                f = 1;
                break;
            }
        }

        if (f== 0)
                  System.out.println(low);

        ++low;
    }

   

         
        }
      
        
        }
