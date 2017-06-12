import java.util.scanner

public class whileNumbers{

public static void main (string [] srgs){
	Scanner scan = new Scanner(System.in);

	System.out.println("enter multiples of 5 less than 105");
	int start= scan.nextInt();
	
}
	switch(start)
	{
		case 100:
			System.out.println("0");
		break;
		case 95:
			System.out.println("1");
		break;
		case 80:
			System.out.println("1");
		break;
		case 85:
			System.out.println("2");
		break;
		case 70:
			System.out.println("3");
		break;
		case 75:
			System.out.println("5");
		break;
		case 60:
			System.out.println("8");
		break;
		case 65:
			System.out.println("13");
		break;
		case 50:
			System.out.println("21");
		break;
		case 55:
			System.out.println("34");
		break;
		
		default:
		System.out.println("not  a vlid entery");
		break;
		
}
}
