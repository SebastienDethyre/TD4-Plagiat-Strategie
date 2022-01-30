package Plagiarism;

import java.util.*;

public class LevenshteinStrategy implements EditDistanceStrategy {

    public LevenshteinStrategy() {
    }
    
    @Override
	public Double computeDistance(String t1) {
		CorpusText c = new CorpusText();
		return (double) t1.compareToIgnoreCase(c.getText(1));
	}
}