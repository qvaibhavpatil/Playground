import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum=0;
      int x;
      while (n>0)
      {
      x= n%10;
       sum= x+sum;
        n=n/10;
      }
        System.out.println(sum);
      }
	}
