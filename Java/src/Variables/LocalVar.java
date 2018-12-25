package Variables;

//The variable which is declared inside the method

public class LocalVar {
	
	
	int a=100;   ///instance Var/Global var-declare inside the class but outside the method
	static int b=12220; // Static var--declare inside the class but outside the method with static
	
	
	
	
	public void method(int a,int b) {
	
	 System.out.println("Local var "+a);

	}
	public void method1(int c,int d) {
		System.out.println(a);

	}

	public static void main(String[] args) {
		
		LocalVar obj=new LocalVar();
		obj.method(10,15);// Local var call --by calling method using object instance
		//new LocalVar().method(50,52);
		System.out.println("Instance Variable "+obj.a);//instance var call --by call var  using object instance
		System.out.println("Static Variable "+LocalVar.b);//Staic var call --by call var  using className
		
		
		
		

	}

}
