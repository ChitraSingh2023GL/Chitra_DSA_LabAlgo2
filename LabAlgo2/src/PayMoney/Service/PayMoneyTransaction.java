package PayMoney.Service;

public class PayMoneyTransaction {

	boolean result=false;
	static int transNumber=0;
	int temp=0;
	public boolean  CalculateTarget(int arr[],int target, int targetCount)
	{

		for(int i=0;i<arr.length;i++)
		{

			if(target>temp && i<targetCount)
			{
				temp=temp+arr[i];
				transNumber++;
			}
		}


		if(temp>=target)
		{
			this.result=true;
		}

		return this.result;
	}
	public void printResult()
	{

		if(this.result==true)
		{
			System.out.printf("Target archived after %d transaction",transNumber);
		}
		else
		{
			System.out.printf("Given target is not achieved");
		}
	}

}
