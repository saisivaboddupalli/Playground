
import java.util.Scanner;
class Main{
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int arr []=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
        
      }
      int s1= in.nextInt();
      int s2=in.nextInt();
     for(int i=0;i<n;i++)
      {
        if(s1==arr[i])
        {
        System.out.println(i);
        }
     }
       if(s2>=1000)
       System.out.println("-1");
     for(int j=0;j<n;j++)
       
     {
       if(s2==arr[j])
       {
         System.out.println(j);
         
       }
   
       
        
     }
      }
      
    }