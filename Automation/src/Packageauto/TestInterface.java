package Packageauto;


import Packageauto.Interface_Ex.Bank;
public class TestInterface 
	{
		
		public static void main (String[] args)
		{
			Bank x=new SBI();
			System.out.println("ROI: " +x.rateOfInterest());
		}
	}


//Create a variable x for SBI bank