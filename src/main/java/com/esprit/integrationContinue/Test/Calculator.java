package com.esprit.integrationContinue.Test;

import org.springframework.stereotype.Service;

import com.esprit.integrationContinue.model.Developper;



@Service("calculatriceService")
public class Calculator  {

	
	public int sum(int a, int b) {
		return a + b;
	}


	public int subtraction(int a, int b) {
		return a - b;
	}


	public int multiplication(int a, int b) {
		return a * b;
	}
   public boolean addDevelopper(int id , String name,String last,String address, String technologie){
	   Developper d1 = new Developper();
	   d1.setIdDevelopper(id);
	   d1.setFirstName(name);
	   d1.setLastname(last);
	   d1.setAddress(address);
	   d1.setTechnologieKhnowledge(technologie);
if (d1  == null)
{
	System.out.println("the user hasn't been add");
	return false ;

   }
else{
	
	return true;
}
	   
	   
   }


	public int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}


	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}
}
