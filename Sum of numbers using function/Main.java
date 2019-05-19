import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println(Sum(n));
	}
  public static int Sum(int y)
  {
    int s =0;
    for (int i =1;i<=y;i++)
    {
      s=s+i;
    }
    return s;
  }
  
}