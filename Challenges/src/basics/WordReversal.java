package basics;

public class WordReversal {
	
	//Receives an word and returns it reversed
	public String ReverseWord(String Word) {
				
		StringBuilder SB = new StringBuilder(); 
		
		if(Word ==null || Word.isEmpty())
			return Word;				

		for(int i=Word.toCharArray().length-1
				; i>=0  
				;i--) {
		 SB.append(Word.toCharArray()[i]);
		}							
			
		return SB.toString();
	}
}
