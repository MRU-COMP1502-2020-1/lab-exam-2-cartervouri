package lsystems;

public class B_A extends LRule{

	@Override
	public char getMatch() {
		return 'B';
	}

	@Override
	public char[] getBody() {
		char[] b = {'A'};
		return b;
	}

}
