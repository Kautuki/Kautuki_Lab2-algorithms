package Denomination;

import java.util.Scanner;

public class Driver {

	private static Scanner sc;

	public static void main(String args[])
	{
	sc = new Scanner(System.in);
	System.out.println("Enter the number of denominations");
	int numOfDenominations=sc.nextInt();
	int[] denominations=new int[numOfDenominations];
	System.out.println("Enter the currency denominations");
	for(int i=0;i<numOfDenominations;i++)
	{
		denominations[i]=sc.nextInt();
		
	}
	System.out.println("Enter the amount you want to pay");
	int amount=sc.nextInt();
	Currency currency=new Currency(denominations,numOfDenominations);
	MergeSort.sort(currency.denominations,0,numOfDenominations-1);
	
	NotesCount.numberofdenominations(currency.denominations,amount);
	
	}	

}
