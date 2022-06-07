package basics;

public class Challenges {

	public static void main(String[] args) {
		
		WordReversal WR = new WordReversal();
		FindWord FR = new FindWord();
		
		System.out.println(WR.ReverseWord("This is an example"));
		//Expected output: elpmaxe na si sihT
		
		System.out.println(FR.Find("This is some sentence",3));
		//Expected output: sentence
	}
}