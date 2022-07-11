package com.greatlearning.main;

public class NotesCount {

	public void notesCountImplementation(int currency[],int amount) { //method to calculate counting of notes

		int [] noteCounter = new int[currency.length]; 

		
			for(int i=0;i<currency.length;i++) {  

				if(amount >= currency[i])  
				{
					noteCounter[i] = amount / currency[i]; 
					amount = amount - noteCounter[i]*currency[i]; 
				}

			}
			if(amount>0) {

				System.out.println("Denomination value given is higher");

			}
			else
			{
				System.out.println("Payment jis above the order");
			}

			for(int i=0;i<currency.length;i++) {
				if(noteCounter[i] !=0) {
					System.out.println(currency[i]+ ":" + noteCounter[i]);
				}
			}
	}
}




		


	

