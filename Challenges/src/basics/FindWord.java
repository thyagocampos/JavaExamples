package basics;

public class FindWord {

	public String Find(String Sentence, int Index) {
		
		String[] SentenceSplit = Sentence.split(" ");

		
		if(!(Index > SentenceSplit.length) && !(Index < SentenceSplit.length))	
			return SentenceSplit[Index];
		else 
			return "";								
	}
	
}
