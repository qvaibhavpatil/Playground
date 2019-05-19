import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println(Square(n));
	} 
  public static int Square ( int y)
  {
    int sq;
    sq=y*y;
    return sq;
  }
}