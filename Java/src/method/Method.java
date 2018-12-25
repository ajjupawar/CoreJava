package method;

/**method 
 * it is used to perform/build the logics(+-/)
 * @author Ajinkya
 * Types
 * 1 Static
 * 2 Instance
 *
 */

public class Method {
	
	int a=10,b=3,c;
	
	
	public void m1(int a,int b) {//instance method 

		c=a+b;
		System.out.println("Instance method logic c="+c);

	}
	public static void m2(int a,int b) {//Static method
		int c;
		c=a+b;
		System.out.println("Static method logic c="+c);
		
		
	}
	

	public static void main(String[] args) {
		Method obj=new Method();
		obj.m1(2,6);
		Method.m2(6, 5);

	}

}
