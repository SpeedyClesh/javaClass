/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumberchecker;

import java.util.Scanner;

/**
 *
 * @author speedyclesh
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int prime;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number to check if its a prime number:");
	int num=scan.nextInt();
	for(int x=2;x<=num/2;x++)
	{
           prime=num%x;
	   if(prime==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
   }
    }
    

