package lSystemsException;

public class LSystemSymbolException extends Exception {
	char s;
	
	public LSystemSymbolException(char s) {
		this.s = s;
	}

	public char getSymbol() {
		return s; 
	}

}
