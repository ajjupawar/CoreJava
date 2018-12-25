package decisionMaking;

public class Switch_Statement {
	
	
	public static void main(String[] args) {
		int iDay = 1;
		String sDay = "Monday";
      //Switch(Datatype)
 		switch(iDay){
 		//Case datatype_value:it will check the with switch codition
 			case 1:
 		// Logic or what you want to print
 				System.out.println("Today is Monday");
 				break;
 				// Break statement is important otherwise all cases are executed
			case 3:
				System.out.println("Today is Tuesday");
				break;
			case 4:
				System.out.println("Today is Wednesday");
				break;
			case 5:
				System.out.println("Today is Thursday");
				break;
			case 6:
				System.out.println("Today is Friday");
				break;
			case 7:
				System.out.println("Today is Saturday");
				break;
			default:
				System.out.println("Today is Sunday");
				break;
 				}

 		switch(sDay){
			case "Mnday":
				System.out.println("Today is Monday");
				break;
			case "Tuesday":
				System.out.println("Today is Tuesday");
				break;
			case "Wednesday":
				System.out.println("Today is Wednesday");
				break;
			case "Thursday":
				System.out.println("Today is Thursday");
				break;
			case "Friday":
				System.out.println("Today is Friday");
				break;
			case "Saturday":
				System.out.println("Today is Saturday");
				break;
			default:
				System.out.println("Today is Sunday");
				break;
 				}
		}
	}


