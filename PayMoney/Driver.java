package PayMoney;

import java.util.Scanner;

public class Driver {

	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int t =sc.nextInt();
		
		while(t>0)
		{
			System.out.println("Enter the value of target");
			int target=sc.nextInt();
			
			Transaction tran=new Transaction();
			int ans=tran.paymoneytransaction(arr,target);
			
			if(ans==-1)
			{
				System.out.println("Target cannot be achieved ");
			}
			else
			{
				System.out.println("Target achieved after "+ans+" transactions ");
			}
			t--;
		}

		
		
}
}
