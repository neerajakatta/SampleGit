package Seleniumpackage;

public class Inheritance3 extends inheritance2 {
	void div(int x, int y)
	{
		float z = x/y;
		System.out.println("div " + z);
	}
	
	
	public static void main(String[] args) {
	
		Inheritance3 obj = new Inheritance3();
		obj.add(10, 20);
		obj.sub(100, 50);
		obj.mul(100, 50);
		obj.div(100, 50);

	}

}
