import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
      
       int x, y, z;
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter the first number:");
        x = s.nextInt();
        //System.out.print("Enter the second number:");
        y = s.nextInt();
        //System.out.print("Enter the third number:");
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println(x);
        }
        else if(y > z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
 
    }
		// Type your code here
    }
