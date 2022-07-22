package PayMoney;

public class Transaction {

	public int paymoneytransaction(int[] arr,int target)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(target== arr[i] || target<arr[i])
			{
				return i+1;
			}
			else
			{
				target=target-arr[i];
			}
		}
		
		return -1;
	}
}
