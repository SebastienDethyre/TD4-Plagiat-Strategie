
import java.util.*;

/**
 * 
 */
public class LevenshteinStrategy implements EditDistanceStrategy {

    /**
     * Default constructor
     */
    public LevenshteinStrategy() {
    }

    /**
     * @param String t1 
     * @param String t2 
     * @return
     */
    

	@Override
	public Double computeDistance(String t1) {
		CorpusText c = new CorpusText();
		return (double) t1.compareToIgnoreCase(c.getText(1));
	}


}