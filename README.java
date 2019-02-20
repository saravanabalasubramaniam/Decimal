import java.io.*;
import java.util.*;
class Decimal
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	double a=input.nextFloat();
	double b=Math.ceil(a);
	System.out.println(Math.round(b));
   }
}
