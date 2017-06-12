
public class fibonacciSeris{

public static void main (string [] srgs){
int first = 0;
int second =1;
int limit = 10;
int next;
}
	for(int i = 0; i<10; i++){
		
		if (i <= 1){
			next = i;
	} 
		else{
			next = second + first;
			first=second
			second=next
	}
		

		System.out.println(next +"="+second +"+"+first);
		
}
}
