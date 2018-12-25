package decisionMaking;

/*continue statement is used to continue the loop. 
It continues the current flow of the program 
and skips the remaining code at the specified condition.*/
public class ContinueExample {

	public static void main(String[] args) {  
	    //for loop  
	    for(int i=1;i<=10;i++){  
	        if(i==5)//conditional statement
	        {  
	            //using continue statement  
	            continue;//it will skip conditional statement  
	        }  
	        System.out.println(i);  
	    }  
	}  
	
}
