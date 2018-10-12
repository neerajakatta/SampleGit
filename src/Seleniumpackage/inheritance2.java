package Seleniumpackage;

public class inheritance2 extends Inheritance1 {

	void mul(int x, int y)
	{
		int z = x*y;
		System.out.println("mul" +z);
	}
	
	public static void main(String[] args)
	
	{
		inheritance2 obj = new inheritance2();
	}

}
