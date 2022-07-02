package basics;

import java.util.ArrayList;
import java.util.Collections;

public class PhoneNumber {
	
	private String[] a;
	private String[] b;
	private String phone;
	
	public PhoneNumber(String[] A, String[] B, String Phone) {
		a = A;
		b = B;
		phone = Phone;
	}
	
	 public String solution()
     {                        
         ArrayList<String> namesMatches = new ArrayList<String>();

         for(int i=0; i<b.length; i++)
         {
             if (b[i].contains(phone))
                 namesMatches.add(a[i]);
         }
         
         Collections.sort(namesMatches);

         if (namesMatches.size() > 0)
             return namesMatches.get(0);

         return "NO CONTACT";
     }

}
