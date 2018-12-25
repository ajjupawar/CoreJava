package programs;

/*153 = (1*1*1)+(5*5*5)+(3*3*3) =1+125+27=153 
ex 0, 1, 153, 370, 371, 407 */


public class ArmstrongExample {
	
	  public static void main(String[] args)  {  
		    int c=0,a,temp;  
		    int n=153;//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;        // 153%10=3      15%10=5      1.5%10=1
		    n=n/10;        //15.3           1.5          0.15
		    c=c+(a*a*a);  //0+(3*3*3)     27+(5*5*5)    152+(1*1*1)=153
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  

}
