package PayMoney.Main;
import java.util.Scanner;

import PayMoney.Service.PayMoneyTransaction;


public class PayMoneyTransactionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int transationArray[];
		int target,targetCount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size=sc.nextInt();
		transationArray=new int[size];
		System.out.println("enter the values of array");
		for(int i=0;i<transationArray.length;i++)
		{
			transationArray[i]=sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved\r\n"
				+ "");
		targetCount=sc.nextInt();
		System.out.println("enter the value of target");
		target=sc.nextInt();
		PayMoneyTransaction payobj=new PayMoneyTransaction();
		payobj.CalculateTarget(transationArray, target,targetCount);
		payobj.printResult();
		sc.close();

	}

}
