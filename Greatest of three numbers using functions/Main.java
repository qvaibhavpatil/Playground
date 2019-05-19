import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      
      int n4=(compare(n1,n2));
      
      if (n3>n4)
        System.out.println(n3);
      else
        System.out.println(n4);
                          
	}
  public static int compare( int x , int y) 
  {
    if (x > y )
      return x;
    else
      return y;
    
    }
}
