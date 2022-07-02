package basics;

public class FindWord {

	//Given a sentence returns the correspondent word at given index. 	
	public String Find(String Sentence, int Index) {
		
		String[] SentenceSplit = Sentence.split(" ");

		
		if(!(Index > SentenceSplit.length) && !(Index < SentenceSplit.length))	
			return SentenceSplit[Index];
		else 
			return "";								
	}
	
}
