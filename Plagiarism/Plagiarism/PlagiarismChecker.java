package Plagiarism;

import java.util.*;

public class PlagiarismChecker {
	private int treshold;
    private EditDistanceStrategy mesStrat;

    public PlagiarismChecker() {
    }

    public void setTreshold(int treshold) {
    	this.treshold = treshold;
    }

    public void setCheckerStrategy(EditDistanceStrategy checkerStategy) {
        mesStrat = checkerStategy;
    }

    public boolean checkPlagiarism(String t) {
        if(mesStrat.computeDistance(t) < treshold)
        	return false;
        return true;
    }
}