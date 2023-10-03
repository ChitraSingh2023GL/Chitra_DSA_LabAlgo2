package denomationCurrency.Service;

public class checkDenomationCurrecy {

	int countsize;
	public void  countCurrency(int[] currencyArray,int target)
	{

		int[] notecount; 
		this.countsize=currencyArray.length;
		notecount= new int[this.countsize];
		for(int i=0;i<currencyArray.length;i++)
		{

			if(target>=currencyArray[i])
			{
				notecount[i]=target/currencyArray[i];
				target=target%currencyArray[i];

			}


		}
		if(target!=0)
		{

			System.out.println("Given target is not achieved");
		}
		else
		{
			for(int i=0;i<notecount.length;i++)
			{

				if(notecount[i]!=0)
				{
					System.out.println(currencyArray[i]+ ":"+notecount[i]);
				}
			}
		}


	}

}
