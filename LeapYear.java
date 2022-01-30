package leap;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter a year:  ");
	      Scanner y = new Scanner(System.in);
	      int year = y.nextInt();
	      y.close();
	      System.out.println("Entered year:  " + year);
	      if((year >= 1582)) {
	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println(year + " year is a leap year");
	      else
	         System.out.println(year + " year is not a leap year");
	      }
	      else {
	    	  System.out.println(year + " year is invalid");
	      }

	}

}
