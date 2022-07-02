package basics;

public class Challenges {

	public static void main(String[] args) {
		
		WordReversal WR;
		FindWord FR;				
		FindPair FP;		
		PhoneNumber PN; 
		
		
		WR = new WordReversal();
		System.out.println(WR.ReverseWord("This is an example"));
		//Expected output: elpmaxe na si sihT
		
		FR = new FindWord();
		System.out.println(FR.Find("This is some sentence",3));
		//Expected output: sentence
		
		FP = new FindPair(new int[] {23,45,70,1,9,5,78,105,22},87);
		System.out.println(FP.ReturnPair());
		
        String[] A = {"pim", "pom", "ann" };
        String[] B = { "9999999999999", "777888999", "11111888899977" };        
		
        //Searches on array B for a number that contains 88999 and returns the name of contact
        // on array A or NO CONTACT if nothing is found. 
        //It will return the first contact ordered alphabetically.        
		PN = new PhoneNumber(A,B,"88999");		
	}
}