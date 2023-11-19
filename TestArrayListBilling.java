package arrayListBillingProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayListBilling {

	public static void main(String[] args)throws FileNotFoundException {
		System.out.println("Reading from Billing.in Input file: ");
		
		Scanner inFile= new Scanner (new FileReader ("Billing.in"));
		List<Billing> billingArrList = new ArrayList<> ();
		
			
		double prd_Price,Fed_Tax = 0, Prv_Tax = 0;
		int prd_Qty;
		
		int index=0;
		
		while (inFile.hasNextLine()) {
			
			
			prd_Price=inFile.nextDouble();
			prd_Qty=inFile.nextInt();
			Fed_Tax=inFile.nextDouble();
			Prv_Tax=inFile.nextDouble();
			
			
			billingArrList.add(new Billing());
			
				
			billingArrList.get(index).setPrd_Price(prd_Price);
			billingArrList.get(index).setPrd_Qty(prd_Qty);
			
			
			index++;
		}
		Billing.setFed_Tax(Fed_Tax);
		Billing.setPrv_Tax(Prv_Tax);
		
		inFile.close();
		
		System.out.println("Printing ArrayList billingArrList and perform processing\n");
		for (int i=0; i<billingArrList.size(); i++) {
			
			System.out.println("billingArrList ["+i+ "] Object: "+billingArrList.get(i));
			System.out.println("The total of Billing of billingArrList ["+i+ "] object is "+ 
			String.format("%.2f", billingArrList.get(i).CalculateBilling())+"$"+"\n");
		}
		double sum=0;
		
		for (int j=0; j<billingArrList.size(); j++) {
			sum+=billingArrList.get(j).CalculateBilling();
			
		}
		System.out.println("All Total of Billing is "+String.format("%.2f", sum)+ "$");
		System.out.println("Thank you for Doing Business With Us");
	}

}
