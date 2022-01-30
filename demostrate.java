package demostraction;

public class demostrate {
	   static int w = 2;
	   static int x;
	   static int y;
	   static void func(int z) {
	      System.out.println("w = " + w);
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   static {
	      System.out.println("Running static initialization block.");
	      x = w * 2;
	      y = x + 5;
	   }
	public static void main(String[] args) {
		func(4);

	}

}
