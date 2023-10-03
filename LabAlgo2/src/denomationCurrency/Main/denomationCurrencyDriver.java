package denomationCurrency.Main;

import java.util.Scanner;

import denomationCurrency.Service.MergeSortService;
import denomationCurrency.Service.checkDenomationCurrecy;

public class denomationCurrencyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortService sortObject=new MergeSortService();
		checkDenomationCurrecy countObject=new checkDenomationCurrecy();
		Scanner sc=new Scanner(System.in);
		int currencySizeArray[];
		System.out.println("enter the size of currency denominations");
		int size=sc.nextInt();
		currencySizeArray=new int[size];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<currencySizeArray.length;i++)
		{
			currencySizeArray[i]=sc.nextInt();
		}

		System.out.println("enter the amount you want to pay");

		int payAmount=sc.nextInt();
		sortObject.mergeSort(currencySizeArray, 0,currencySizeArray.length-1);
		countObject.countCurrency(currencySizeArray,payAmount);
		sc.close();


	}

}
