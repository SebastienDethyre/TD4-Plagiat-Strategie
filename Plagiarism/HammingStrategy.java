
import java.util.*;

/**
 * 
 */
public class HammingStrategy implements EditDistanceStrategy {

    public HammingStrategy() {
    }

	public Double computeDistance(String t1) {
		CorpusText c = new CorpusText();
		return (double) t1.compareTo(c.getText(1));
	}
}