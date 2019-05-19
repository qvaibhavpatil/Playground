import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      //System.out.println(n);
      int x = n%10;
      while (n >= 10)
      {
      n=n/10;
      }
    
      int l = n%10;
      
      //System.out.println(l);
      int sum = l+x;
      System.out.println(sum);
	
}
}