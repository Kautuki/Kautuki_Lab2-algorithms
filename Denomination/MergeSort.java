package Denomination;

public class MergeSort {
	
	static void merge(int arr[],int left,int mid,int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;
		
		int leftarray[] =new int[n1];
		int rightarray[]=new int[n2];
		
		for(int i=0;i<n1;i++)
			leftarray[i]=arr[left+i];
		for(int j=0;j<n2;j++)
			rightarray[j]=arr[mid+1+j];
		
		int i=0,j=0;
		
		int k=left;
		while(i<n1 && j<n2)
		{
			if(leftarray[i]>= rightarray[j])
			{
				arr[k]=leftarray[i];
				i++;
			}
			else
			{
				arr[k]=rightarray[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			arr[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=rightarray[j];
			j++;
			k++;
		}
	}
	
	
	
	public static void sort(int[] arr,int left,int right)
	{
		if(left<right)
		{
		int mid=(left+right)/2;
		
		sort(arr,left,mid);
		sort(arr,mid+1,right);
		
		merge(arr,left,mid,right);
		}
	}

}
