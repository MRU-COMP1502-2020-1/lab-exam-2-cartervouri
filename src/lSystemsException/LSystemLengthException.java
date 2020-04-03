package lSystemsException;

public class LSystemLengthException extends Exception {
	int l;
	public LSystemLengthException(int l) {
		this.l =l;
	}
}
