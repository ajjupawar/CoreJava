package oops;
/**Inheritance
 * 1.Aquiring the behevior and properties from one class to another
 * 2.By using extends keyword
 * 3.Advantages -----Reduce the length of code
 * 
 * @author Ajinkya
 *
 */
public class Inheritance extends Parent{
	
	
	
	public void m2() {
		System.out.println("Child Class method");

	}

	public static void main(String[] args) {
		Inheritance obj=new Inheritance();
		obj.m1();
		obj.m2();
		obj.m3();
		

	}

}
