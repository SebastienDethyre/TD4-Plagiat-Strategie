
import java.util.*;

/**
 * 
 */
public class PlagiarismChecker {

	private int treshold;
    private EditDistanceStrategy mesStrat;
    private String t;
    public PlagiarismChecker() {
    }

    
    public void setTreshold(int treshold) {
    	this.treshold = treshold;
    }
    /**
     * @param checkerStategy
     */
    public void setCheckerStrategy(EditDistanceStrategy checkerStategy) {
        mesStrat = checkerStategy;
    }

    /**
     * @param String t 
     * @return boolean
     */
    public boolean checkPlagiarism(String t) {
        if(mesStrat.computeDistance(t) < treshold)
        	return false;
        return true;
    }

}