package lsystems;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import lSystemsException.LSystemSymbolException;
import lSystemsException.LSystemLengthException;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		List<Character> rchars = new ArrayList<Character>();
		for (LRule r : rules) {
			rchars.add(r.getMatch()); 
		}
		List<Character> newLine = new ArrayList<Character>();
		for(char character : line) {
			newLine.add(character);
		}
		if (line.length == 0) {
			throw new LSystemLengthException(line.length);
		}
		for (char character : line) {
			if(!rchars.contains(character)) {
				throw new LSystemSymbolException(character);
			}
		}
		for (int i =0; i < line.length; i++) {
			for (LRule r : rules) {
				if(line[i] == r.getMatch()) {
					if(r.getBody().length == 0) {
						newLine.remove(i);
					} else {
						int c = 0;
						for (char character : r.getBody()) {
							if (c == 1 ) {
								newLine.add(i + 1,character);
								i++;
							} else {
								newLine.set(i, character);
								c += 1;
							}
						}
					}
				}
				line = listToArray(newLine);
			}	
		}
	}
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		return new String(line);
	}
	
}
