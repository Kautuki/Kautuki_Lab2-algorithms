package Denomination;

public class NotesCount {
	

	public static void numberofdenominations(int[] denominations, int amount) {
		// TODO Auto-generated method stub
		int[] notesCounter=new int[denominations.length];
		for(int i=0;i<denominations.length;i++)
		{
			if(amount >=denominations[i])
			{
				notesCounter[i]=amount/denominations[i];
				amount=amount- notesCounter[i]*denominations[i];
			}
		}
		
		if(amount>0)
		{
			System.out.println("Exact amount cannot be given with the highest denomination");
		}
		else
		{
			System.out.println("Your payment approach in order to pay amount with minimum denominations is:");
			for(int i=0;i<notesCounter.length;i++)
			{
				if(notesCounter[i]!=0)
				{
					System.out.println(denominations[i]+" : "+ notesCounter[i]);
				}
			}
		}
	}

	
}
