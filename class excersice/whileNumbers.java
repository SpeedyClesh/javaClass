import java.util.scanner

public class whileNumbers{

public static void main (string [] srgs){
	Scanner scan = new Scanner(System.in);

	System.out.println("enter any number");
	int yourAge = scan.nextInt();
	
}
	while(yourAge < 18){
		System.out.println("do you want to continue? yes or no");
		string conditionFactor = scan.nextLine();
		if (conditionFactor.equals("no")) 
			break;

		System.out.println("you are way too young for this");
		
}
}
