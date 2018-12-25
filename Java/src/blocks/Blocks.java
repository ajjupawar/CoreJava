package blocks;

public class Blocks {
	
	{
		int a=10;
		System.out.println("instance block executed");
		System.out.println("Instance a="+a);
	}
	
	static{
		int a=10111;
		System.out.println("Static block executed");
		System.out.println("Static block a="+a);
	}
	public Blocks() {

      System.out.println("Constructor is executed");
	}
	public void m1() {
		 
		System.out.println("method is executed");

	}

	public static void main(String[] args) {
		
		Blocks obj=new Blocks();
		obj.m1();
		
		

	}

}
