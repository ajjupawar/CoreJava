package decisionMaking;
/*break is used to break loop or switch statement,
in case of inner loop, it breaks only inner loop.
*/

public class BreakExample {
	
	public static void main(String[] args) {  
	    //using for loop  
	    for(int i=1;i<=10;i++)//iterating the for loop
	    {  
	        if(i==9){ //breaking condtion 
	           
	            break;   //breaking the loop  
	        }  
	        System.out.println(i);  //After breaking the loop remaining code is terminated.
	    }  
	}  

}
